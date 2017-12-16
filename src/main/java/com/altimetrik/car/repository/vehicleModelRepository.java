package com.altimetrik.car.repository;
import com.altimetrik.car.entity.*;
import java.util.List;

public interface vehicleModelRepository {
    List<vehicleModel> findAll();
}
