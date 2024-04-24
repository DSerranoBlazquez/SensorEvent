package com.microservice.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaEventProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public KafkaEventProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendEvent(String message) {
        kafkaTemplate.send("sensor_events", message);
    }
}
