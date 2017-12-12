package com.altimetrik.car.controller;

import com.altimetrik.car.entity.vehicleManufacture;
import com.altimetrik.car.service.vehicleManufactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Manufacture")
public class vehicleManufactureController {

    @Autowired
    vehicleManufactureService vehicleManufactureService;

    @RequestMapping(method = RequestMethod.GET)
    public List<vehicleManufacture> findAllManufactures(){
        return vehicleManufactureService.findAll();
    }
}
