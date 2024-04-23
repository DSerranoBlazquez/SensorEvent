package com.microservice.kafka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaEventConsumer {

	@Autowired
    private ProcessedEventStorageService storageService;

    @KafkaListener(topics = "sensor_events", groupId = "sensorevent")
    public void listen(String message) {
    	ProcessedSensorEvent processedEvent = new ProcessedSensorEvent(message); // Suponiendo que tienes un constructor apropiado en la clase ProcessedSensorEvent
        storageService.storeProcessedEvent(processedEvent);
    }
}
