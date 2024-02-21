package marketkurly.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import marketkurly.infra.AbstractEvent;

@Data
public class Paid extends AbstractEvent {

    private Long id;
    private Long orderid;
    private Integer amount;
    private String paymethod;
    private String status;
}
