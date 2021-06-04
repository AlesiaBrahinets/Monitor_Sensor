package org.example.controller;

import org.example.entity.Sensor;
import org.example.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MyController {
    @Autowired
    SensorService sensorService;

    @RequestMapping("/")
    public String showAllSensor(Model modele){
        List<Sensor> allSensor=sensorService.getAllSensors();
        modele.addAttribute("allSnr",allSensor);
        return "all_sensor_from_table";
    }

    @RequestMapping("/addNewSensor")
    public String addNewSensor(Model model){
        Sensor sensor=new Sensor();
        model.addAttribute("sensor",sensor);
        return "sensor-info";
    }
    @RequestMapping("/saveSensor")
    public String saveSensor(@ModelAttribute("sensor") Sensor sensor) {
        sensorService.saveSensor(sensor);
        return "redirect:/";
    }
    @RequestMapping("/updateInfo")
    public String updateSensor(@RequestParam("snId") int id, Model model){
       Sensor sensor=sensorService.getSensor(id);
       model.addAttribute("sensor",sensor);
        return "sensor-info";
    }
    @RequestMapping("/deleteSensor")
    public String deleteSensor(@RequestParam("snId") int id){
        sensorService.deleteSensor(id);
        return "redirect:/";

    }
    /*@Autowired
    EmployeeDAO employeeDAO;
    @RequestMapping("/")
    public String showAllEmployee(Model model){
        List<Employee> allEmployee=employeeDAO.getAllEmployees();
        model.addAttribute("allEmps",allEmployee);
        return "all-employee";
    }*/
}
