package com.altimetrik.car.controller;

import com.altimetrik.car.service.vehicleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.altimetrik.car.entity.vehicleType;

import java.util.List;

@RestController
@RequestMapping("/Car")
public class vehicleTypeController {

    @Autowired
    vehicleTypeService vehicleTypeService;

    @RequestMapping(method = RequestMethod.GET)
    public List<vehicleType> findAll(){
        return  vehicleTypeService.findAll();

    }


}
