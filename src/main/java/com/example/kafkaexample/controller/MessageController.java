package com.example.kafkaexample.controller;

import com.example.kafkaexample.MessageRequest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

  private KafkaTemplate<String, String> kafkaTemplate;

  public MessageController(KafkaTemplate<String, String> kafkaTemplate) {
    this.kafkaTemplate = kafkaTemplate;
  }

  @PostMapping("/api/v1/messages")
  public void publish(@RequestBody String message) {
    System.out.println("response");
    kafkaTemplate.send("kafkaExample", message);
  }

  @PostMapping("/api/v1/messages/chat")
  public void sendChat(@RequestBody String message) {
    kafkaTemplate.send("sendChat", message);
    kafkaTemplate.send("asdf", message);
  }
}
