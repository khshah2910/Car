package com.altimetrik.car.service;

import com.altimetrik.car.entity.vehicleType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.altimetrik.car.repository.*;

import java.util.List;

@Service
public class vehicleTypeServiceImpl implements vehicleTypeService{

    @Autowired
    vehicleTypeRepository vehicleTypeRepository;


    @Override
    public List<vehicleType> findAll() {
        return vehicleTypeRepository.findAll();
    }
}
