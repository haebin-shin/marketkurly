package marketkurly.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import marketkurly.infra.AbstractEvent;

@Data
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private Long prodctid;
    private Integer qty;
    private Long userid;
    private Integer amount;
    private String adress;
    private String status;
}
