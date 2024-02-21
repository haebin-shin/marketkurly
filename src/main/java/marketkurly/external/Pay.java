package marketkurly.external;

import java.util.Date;
import lombok.Data;

@Data
public class Pay {

    private Long id;
    private Long orderid;
    private Integer amount;
    private String paymethod;
    private String status;
}
