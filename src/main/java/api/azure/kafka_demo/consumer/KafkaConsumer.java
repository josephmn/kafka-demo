package api.azure.kafka_demo.consumer;

import api.azure.kafka_demo.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    //@KafkaListener(topics = "example-message-topic", groupId = "myGroup")
    public void consumeMsg(String msg) {
        log.info("Consuming the message from topic -> : example-message-topic :: '{}'", msg);
    }

    @KafkaListener(topics = "example-message-topic", groupId = "myGroup")
    public void consumeJsonMsg(Student student) {
        log.info("Consuming the Student message from topic -> : example-message-topic :: '{}'", student.toString());
    }
}
