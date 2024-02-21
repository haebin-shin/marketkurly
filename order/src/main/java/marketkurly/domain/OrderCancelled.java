package marketkurly.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import marketkurly.domain.*;
import marketkurly.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private Long prodctid;
    private Integer qty;
    private Long userid;
    private Integer amount;
    private String adress;
    private String status;

    public OrderCancelled(Order aggregate) {
        super(aggregate);
    }

    public OrderCancelled() {
        super();
    }
}
//>>> DDD / Domain Event
