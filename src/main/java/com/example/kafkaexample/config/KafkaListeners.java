package com.example.kafkaexample.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

  @KafkaListener(topics = "kafkaExample", groupId = "groupId")
  void listener(String data) {
    System.out.println("Listner received :" + data + "  #");
  }

  @KafkaListener(topics = "sendChat", groupId = "chat1")
  void chatListener(String data) {
    System.out.println("chat received : " + data + "!!");
  }
}
