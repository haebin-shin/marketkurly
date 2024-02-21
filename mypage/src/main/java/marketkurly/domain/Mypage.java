package marketkurly.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "Mypage_table")
@Data
public class Mypage {

    private Long orderid;
    private Long payid;
    private Long deliveryid;
    private String orderstatus;
    private String paystatus;
    private String deliverystatus;
}
