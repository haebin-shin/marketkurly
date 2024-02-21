package marketkurly.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import marketkurly.domain.*;
import marketkurly.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryRequested extends AbstractEvent {

    private Long id;
    private Long orderid;
    private String address;
    private String status;

    public DeliveryRequested(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryRequested() {
        super();
    }
}
//>>> DDD / Domain Event
