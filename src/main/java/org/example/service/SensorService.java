package org.example.service;

import org.example.entity.Sensor;

import java.util.List;

public interface SensorService {
    public List<Sensor> getAllSensors();
    public void saveSensor(Sensor sensor);
    public Sensor getSensor(int id);
    public void deleteSensor(int id);

}
