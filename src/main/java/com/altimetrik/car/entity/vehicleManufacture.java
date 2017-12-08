package com.altimetrik.car.entity;

import javax.persistence.*;
import java.util.List;
import com.altimetrik.car.entity.*;
@Entity
public class vehicleManufacture {
    @Id
    private String manufactureId;
    private String manufactureName;
    private String vehicleTypeId;

    @OneToOne(cascade = CascadeType.ALL)
    private vehicleModel vehicleModel;

    public String getManufactureId() {
        return manufactureId;
    }

    public void setManufactureId(String manufactureId) {
        this.manufactureId = manufactureId;
    }

    public String getManufactureName() {
        return manufactureName;
    }

    public void setManufactureName(String manufactureName) {
        this.manufactureName = manufactureName;
    }

    public String getVehicleTypeId() {
        return vehicleTypeId;
    }

    public void setVehicleTypeId(String vehicleTypeId) {
        this.vehicleTypeId = vehicleTypeId;
    }

    public com.altimetrik.car.entity.vehicleModel getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(com.altimetrik.car.entity.vehicleModel vehicleModel) {
        this.vehicleModel = vehicleModel;
    }
}
