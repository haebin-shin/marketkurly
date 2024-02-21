package marketkurly.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import marketkurly.domain.*;
import marketkurly.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class PayCanceled extends AbstractEvent {

    private Long id;
    private Long orderid;
    private Integer amount;
    private String paymethod;
    private String status;

    public PayCanceled(Pay aggregate) {
        super(aggregate);
    }

    public PayCanceled() {
        super();
    }
}
//>>> DDD / Domain Event
