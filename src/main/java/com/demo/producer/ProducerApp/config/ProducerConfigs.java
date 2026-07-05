package com.demo.producer.ProducerApp.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class ProducerConfigs {
    @Bean
    public NewTopic newTopic(){
        return TopicBuilder.name("test1-topic").partitions(3).replicas(1).build();
    }
}
