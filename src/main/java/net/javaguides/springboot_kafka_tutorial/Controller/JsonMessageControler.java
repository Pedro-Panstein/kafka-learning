package net.javaguides.springboot_kafka_tutorial.Controller;

import net.javaguides.springboot_kafka_tutorial.Kafka.JsonKafkaProducer;
import net.javaguides.springboot_kafka_tutorial.payload.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/json/kafka")
public class JsonMessageControler {

    private JsonKafkaProducer kafkaProducer;

    public JsonMessageControler(JsonKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    //http:localhost:8088/api/v1/json/kafka/publish
    @PostMapping("/publish")
    public ResponseEntity<String> publish(User user) {
        kafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Message sent to kafka topic");
    }
}
