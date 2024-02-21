package marketkurly.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import marketkurly.config.kafka.KafkaProcessor;
import marketkurly.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class DeliverylistViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private DeliverylistRepository deliverylistRepository;
    //>>> DDD / CQRS
}
