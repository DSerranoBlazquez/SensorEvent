package com.microservice.kafka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.microservice.repository.ProcessedSensorEventRepository;

@Component
public class ProcessedEventStorageService {

	@Autowired
    private ProcessedSensorEventRepository repository;

    @Autowired
    public ProcessedEventStorageService(ProcessedSensorEventRepository repository) {
        this.repository = repository;
    }

    public void storeProcessedEvent(ProcessedSensorEvent processedEvent) {
        repository.save(processedEvent);
    }
}
