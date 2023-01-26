package com.data.springjavakafkaclient.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Message {
    private String message;
    private LocalDateTime time;
}
