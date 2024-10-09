package api.azure.kafka_demo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic exampleMessageTopic() {
        return TopicBuilder
                .name("example-message-topic")
//                .partitions(5)
//                .replicas(2)
                .build();
    }
}
