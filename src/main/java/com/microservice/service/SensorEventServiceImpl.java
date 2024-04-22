package com.microservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.model.SensorEvent;
import com.microservice.repository.SensorEventRepository;

@Service
public class SensorEventServiceImpl implements SensorEventService {

	@Autowired
    private SensorEventRepository sensorEventRepository;

    public void createSensorEvent(SensorEvent sensorEvent) {

    	sensorEventRepository.save(sensorEvent);
    }
}
