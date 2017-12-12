package com.altimetrik.car.service;

import com.altimetrik.car.entity.vehicleModel;
import com.altimetrik.car.entity.vehicleType;
import com.altimetrik.car.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class vehicleModelServiceImpl implements vehicleModelService{

    @Autowired
    vehicleModelRepository vehicleModelRepository;

    @Override
    public List<vehicleModel> findAll() {
        return vehicleModelRepository.findAll();
    }
}
