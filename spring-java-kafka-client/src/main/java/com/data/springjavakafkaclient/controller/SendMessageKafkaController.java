package com.data.springjavakafkaclient.controller;

import com.data.springjavakafkaclient.kafka.KafkaClient;
import com.data.springjavakafkaclient.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMessageKafkaController {

    @Autowired
    private KafkaClient kafkaClient;

    @GetMapping
    public void sendMessage(@RequestBody Message message) {
        kafkaClient.sendMessage(message);
    }
}