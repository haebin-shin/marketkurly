package marketkurly.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import marketkurly.domain.*;
import marketkurly.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Paid extends AbstractEvent {

    private Long id;
    private Long orderid;
    private Integer amount;
    private String paymethod;
    private String status;

    public Paid(Pay aggregate) {
        super(aggregate);
    }

    public Paid() {
        super();
    }
}
//>>> DDD / Domain Event
