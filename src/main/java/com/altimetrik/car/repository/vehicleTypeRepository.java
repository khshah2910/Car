package com.altimetrik.car.repository;


import org.springframework.data.repository.CrudRepository;

import com.altimetrik.car.entity.vehicleType;
import org.springframework.stereotype.Repository;

import java.util.*;

public interface vehicleTypeRepository{
    List<vehicleType> findAll();

}
