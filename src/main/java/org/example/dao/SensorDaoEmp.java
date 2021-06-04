package org.example.dao;

import org.example.entity.Sensor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SensorDaoEmp implements SensorDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Sensor> getAllSensor() {
        Session session = sessionFactory.getCurrentSession();
        Query<Sensor> query=session.createQuery("from Sensor", Sensor.class);
        List <Sensor> allSensor=query.getResultList();
        return allSensor;
    }

    @Override
    public void saveSensor(Sensor sensor) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(sensor);
    }

    @Override
    public Sensor getSensor(int id) {
        Session session = sessionFactory.getCurrentSession();
        Sensor sensor=session.get(Sensor.class, id);
        return sensor;
    }

    @Override
    public void deleteSensor(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Sensor> query=session.createQuery("delete from Sensor where id = :sensorId");
        query.setParameter("sensorId", id);
        query.executeUpdate();
    }




    /*@Override

    public void saveSensor(Sensor sensor) {
        Session session=sessionFactory.getCurrentSession();
        session.saveOrUpdate(sensor);

    }

    @Override

    public Sensor getSensor(int id) {
        Session session=sessionFactory.getCurrentSession();
        Sensor sensor=session.get(Sensor.class,id);
        return sensor;
    }

    @Override

    public void deleteSensor(int id) {
        Session session=sessionFactory.getCurrentSession();
        Query<Sensor> query=session.createQuery("delete from Sensor where id =:sensorId");
        query.setParameter("sensorId",id);
        query.executeUpdate();
    }*/
}
