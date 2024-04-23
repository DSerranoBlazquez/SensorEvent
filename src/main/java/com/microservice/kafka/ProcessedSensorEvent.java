package com.microservice.kafka;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "processed_sensor_events")
public class ProcessedSensorEvent {

    @Id
    private String id;
    private String message;

    public ProcessedSensorEvent() {
    }

    public ProcessedSensorEvent(String message) {
        this.message = message;
    }

    // Getters y setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
