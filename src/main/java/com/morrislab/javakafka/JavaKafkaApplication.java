package com.morrislab.javakafka;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class JavaKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaKafkaApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate){
        return args -> {
            for (int i = 0; i < 100; i++) {
               kafkaTemplate.send("morrislab", "Hello morris, this topic works :) " +i);
            }
        };
    }

}
