package com.microservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.microservice.model.SensorEvent;

public interface SensorEventRepository extends MongoRepository<SensorEvent, String> {
}
