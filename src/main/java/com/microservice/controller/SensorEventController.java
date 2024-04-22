package com.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.model.SensorEvent;
import com.microservice.service.SensorEventService;
import com.microservice.service.SensorEventServiceImpl;

@RestController
@RequestMapping(value = "/sensorevent")
public class SensorEventController {

    @Autowired
    private SensorEventServiceImpl sensorEventService;

    @PostMapping("/create")
    public ResponseEntity<String> createSensorEvent(@RequestBody SensorEvent sensorEvent) {

        sensorEventService.createSensorEvent(sensorEvent);
        return new ResponseEntity<>("Se ha creado un registro correctamente en la coleccion sensor_events", HttpStatus.CREATED);
    }
}
