package marketkurly.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import marketkurly.DeliveryApplication;
import marketkurly.domain.DeliveryCanceled;
import marketkurly.domain.DeliveryFinished;
import marketkurly.domain.DeliveryRequested;

@Entity
@Table(name = "Delivery_table")
@Data
//<<< DDD / Aggregate Root
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long orderid;

    private String address;

    private String status;

    @PostPersist
    public void onPostPersist() {
        DeliveryRequested deliveryRequested = new DeliveryRequested(this);
        deliveryRequested.publishAfterCommit();

        DeliveryCanceled deliveryCanceled = new DeliveryCanceled(this);
        deliveryCanceled.publishAfterCommit();

        DeliveryFinished deliveryFinished = new DeliveryFinished(this);
        deliveryFinished.publishAfterCommit();
    }

    public static DeliveryRepository repository() {
        DeliveryRepository deliveryRepository = DeliveryApplication.applicationContext.getBean(
            DeliveryRepository.class
        );
        return deliveryRepository;
    }
}
//>>> DDD / Aggregate Root
