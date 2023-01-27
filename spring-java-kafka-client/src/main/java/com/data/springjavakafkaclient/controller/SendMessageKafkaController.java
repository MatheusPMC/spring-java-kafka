package com.data.springjavakafkaclient.controller;

import com.data.springjavakafkaclient.kafka.KafkaSender;
import com.data.springjavakafkaclient.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class SendMessageKafkaController {

    @Autowired
    private KafkaSender kafkaSender;

    @PostMapping
    public void sendMessage(@RequestBody Message message) {
        kafkaSender.send(message);
    }
}