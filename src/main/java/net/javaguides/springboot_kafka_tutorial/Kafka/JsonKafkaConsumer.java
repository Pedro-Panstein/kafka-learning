package net.javaguides.springboot_kafka_tutorial.Kafka;

import net.javaguides.springboot_kafka_tutorial.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "javaguidesJson", groupId = "consumerGroup")
    public void consume(User user) {

    }
}
