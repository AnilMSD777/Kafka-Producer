package com.demo.producer.ProducerApp.controller;

import com.demo.producer.ProducerApp.services.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class ProducerController {
    @Autowired
    private ProducerService producerService;
    @PutMapping
    public ResponseEntity<Object> sendData() throws InterruptedException {
        producerService.sendData();
        return new ResponseEntity<>("Successfully Completed", HttpStatus.OK);
    }
}
