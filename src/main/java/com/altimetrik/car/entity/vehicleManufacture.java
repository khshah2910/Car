package com.altimetrik.car.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

import com.altimetrik.car.entity.*;

@Entity
@NamedQueries({@NamedQuery(name = "vehicleManufacture.findAll",
        query="SELECT vmf FROM vehicleManufacture vmf"),
})

public class vehicleManufacture {
    @Id
    private String manufactureId;
    private String manufactureName;
    private String vehicleTypeId;

    @ManyToOne(cascade = CascadeType.ALL)
    private vehicleType vehicleType;



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

    public com.altimetrik.car.entity.vehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(com.altimetrik.car.entity.vehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
