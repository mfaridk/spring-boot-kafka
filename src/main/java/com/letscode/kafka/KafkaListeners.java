package com.letscode.kafka;

import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;

@Component
public class KafkaListeners {

    @KafkaListener(topics="kafkademo", groupId = "mfaridk")
    void listener(String data){
        System.out.println("Listener received: "+data + " :) ");

    }
}
