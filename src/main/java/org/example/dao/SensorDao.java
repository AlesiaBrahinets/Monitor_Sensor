package org.example.dao;

import org.example.entity.Sensor;

import java.util.List;

public interface SensorDao {
    public List<Sensor> getAllSensor();

   public void saveSensor(Sensor sensor);

    public Sensor getSensor(int id);

    public void deleteSensor(int id);


}
