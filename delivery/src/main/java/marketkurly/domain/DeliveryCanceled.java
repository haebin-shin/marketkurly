package marketkurly.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import marketkurly.domain.*;
import marketkurly.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryCanceled extends AbstractEvent {

    private Long id;
    private Long orderid;
    private String address;
    private String status;

    public DeliveryCanceled(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryCanceled() {
        super();
    }
}
//>>> DDD / Domain Event
