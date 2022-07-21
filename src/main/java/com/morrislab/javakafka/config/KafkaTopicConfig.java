package com.morrislab.javakafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    //configure a new topic
    @Bean
    public NewTopic morrislabTopic() {
        return TopicBuilder.name("morrislab")
                .build();
    }
}
