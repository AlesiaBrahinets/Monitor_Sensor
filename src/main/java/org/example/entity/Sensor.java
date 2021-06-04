package org.example.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name="sensor")
public class Sensor {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="model")
    private String model;

    @Column(name="ranges")
    private String ranges;

    @Column(name="type")
    private String type;

    @Column(name="unit")
    private String unit;

    @Column(name="location")
    private String location;

    @Column(name="description")
    private String description;

    public Sensor() {
    }
    public Sensor(String name,String model,String type,String unit) {
        this.name=name;
        this.model=model;
        this.type=type;
        this.unit=unit;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRanges() {
        return ranges;
    }

    public void setRanges(String ranges) {
        this.ranges = ranges;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
