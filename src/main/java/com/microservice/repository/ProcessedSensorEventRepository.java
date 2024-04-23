package com.microservice.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.microservice.kafka.ProcessedSensorEvent;

public interface ProcessedSensorEventRepository extends MongoRepository<ProcessedSensorEvent, String> {
}
