package org.example.service;

import org.example.dao.SensorDao;
import org.example.entity.Sensor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class SensorServiceImpl implements SensorService {
    @Autowired
    SensorDao sensorDao;
    @Override
    @Transactional
    public List<Sensor> getAllSensors() {
        return sensorDao.getAllSensor();
    }

    @Override
    @Transactional
    public void saveSensor(Sensor sensor) {
        sensorDao.saveSensor(sensor);
    }

    @Override
    @Transactional
    public Sensor getSensor(int id) {
return sensorDao.getSensor(id);
    }

    @Override
    @Transactional
    public void deleteSensor(int id) {
        sensorDao.deleteSensor(id);
    }


}
