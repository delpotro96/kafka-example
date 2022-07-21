package com.example.kafkaexample.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

  @Bean
  public NewTopic kafkaTopic() {
    return TopicBuilder.name("kafkaExample").build();
  }

  @Bean
  public NewTopic sendChat() {
    return TopicBuilder.name("sendChat").build();
  }
}
