package com.altimetrik.car.controller;

import com.altimetrik.car.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.altimetrik.car.entity.vehicleModel;
import java.util.List;


@RestController
@RequestMapping("/Model")
public class vehicleModelController {


    @Autowired


    vehicleModelService vehicleModelService;

    @RequestMapping(method = RequestMethod.GET)

    public List<vehicleModel> findAll(){
        return vehicleModelService.findAll();
    }




}
