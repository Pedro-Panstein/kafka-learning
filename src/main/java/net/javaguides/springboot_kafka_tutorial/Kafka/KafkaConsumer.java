package net.javaguides.springboot_kafka_tutorial.Kafka;

import net.javaguides.springboot_kafka_tutorial.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "javaguides", groupId = "consumerGroup")
    public void consume(User user) {
        LOGGER.info(String.format("Message received: %s", user.toString()));
    }
}
