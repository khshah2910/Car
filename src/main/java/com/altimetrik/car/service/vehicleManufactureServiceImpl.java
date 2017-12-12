package com.altimetrik.car.service;

import com.altimetrik.car.entity.vehicleManufacture;
import com.altimetrik.car.repository.vehicleManufactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class vehicleManufactureServiceImpl implements vehicleManufactureService{

    @Autowired
    vehicleManufactureRepository vehicleManufactureRepository;

    @Override
    public List<vehicleManufacture> findAll() {
        return vehicleManufactureRepository.findAll();
    }
}
