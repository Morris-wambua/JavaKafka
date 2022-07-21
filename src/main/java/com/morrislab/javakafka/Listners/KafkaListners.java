package com.morrislab.javakafka.Listners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListners {

    @KafkaListener(topics = "morrislab", groupId = "local")
    void listener(String data){
        System.out.println("Listener received: " + data + " :rain");
    }
}
