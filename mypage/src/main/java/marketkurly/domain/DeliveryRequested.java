package marketkurly.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import marketkurly.infra.AbstractEvent;

@Data
public class DeliveryRequested extends AbstractEvent {

    private Long id;
    private Long orderid;
    private String address;
    private String status;
}
