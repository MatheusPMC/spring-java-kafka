package com.data.springjavakafkalistener.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Listener {

    @KafkaListener(topics = "topics", groupId = "group_id")
    public void consume(ConsumerRecord<String, String> message) {
        System.out.println(message.value());
    }
}
