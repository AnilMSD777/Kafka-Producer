package com.demo.producer.ProducerApp.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class ProducerConfigs {
    public NewTopic newTopic(){
        return TopicBuilder.name("test1-topic").build();
    }
}
