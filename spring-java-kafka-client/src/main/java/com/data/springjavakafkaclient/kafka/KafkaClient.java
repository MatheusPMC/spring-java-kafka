package com.data.springjavakafkaclient.kafka;


import com.data.springjavakafkaclient.model.Message;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaTemplate;


public class KafkaClient {

    @Bean
    public NewTopic sendMessage(Message message) {
        return TopicBuilder.name("message")
                .build();
    }

    @Bean
    public ApplicationRunner runner(KafkaTemplate<String, String> template) {
        return args -> {
            template.send("message", "test");
        };
    }
}