package com.altimetrik.car.repository;

import java.util.List;
import com.altimetrik.car.entity.*;

public interface vehicleManufactureRepository {
    List<vehicleManufacture> findAll();
}
