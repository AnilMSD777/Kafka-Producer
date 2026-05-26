package com.demo.producer.ProducerApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ProducerService {
    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;
    public ResponseEntity<Object> sendData() throws InterruptedException {
        for(int i=0;i<100;i++){
            kafkaTemplate.send("test1-topic",Math.random()+","+Math.random());
            Thread.sleep(1000);
        }
        return new ResponseEntity<>(Map.of(Math.random(),Math.random()), HttpStatus.OK);
    }
}
