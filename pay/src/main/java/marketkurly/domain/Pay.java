package marketkurly.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import marketkurly.PayApplication;
import marketkurly.domain.Paid;
import marketkurly.domain.PayCanceled;

@Entity
@Table(name = "Pay_table")
@Data
//<<< DDD / Aggregate Root
public class Pay {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long orderid;

    private Integer amount;

    private String paymethod;

    private String status;

    @PostPersist
    public void onPostPersist() {
        Paid paid = new Paid(this);
        paid.publishAfterCommit();

        PayCanceled payCanceled = new PayCanceled(this);
        payCanceled.publishAfterCommit();
    }

    public static PayRepository repository() {
        PayRepository payRepository = PayApplication.applicationContext.getBean(
            PayRepository.class
        );
        return payRepository;
    }
}
//>>> DDD / Aggregate Root
