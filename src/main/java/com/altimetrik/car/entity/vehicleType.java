package com.altimetrik.car.entity;

import javax.persistence.*;
import com.altimetrik.car.entity.vehicleManufacture;
import org.hibernate.engine.internal.Cascade;

import java.util.HashSet;
import java.util.Set;

///SELECT vehicles FROM vehicleType vehicles ORDER BY vehicles.vehicleTypeId
@Entity
@NamedQueries({@NamedQuery(name = "vehicleType.findAll",
                query="SELECT vehicles FROM vehicleType vehicles ORDER BY vehicles.vehicleTypeId"),

})

public class vehicleType {



    @Id
    private String vehicleTypeId;
    private String vehicleTypeName;


    public String getVehicleTypeId() {
        return vehicleTypeId;
    }

    public void setVehicleTypeId(String vehicleTypeId) {
        this.vehicleTypeId = vehicleTypeId;
    }
    public String getVehicleTypeName() {
        return vehicleTypeName;
    }

    public void setVehicleTypeName(String vehicleTypeName) {
        this.vehicleTypeName = vehicleTypeName;
    }


    @Override
    public String toString() {
        return "vehicleType{" +
                "vehicleTypeId='" + vehicleTypeId + '\'' +
                ", vehicleTypeName='" + vehicleTypeName + '\'' +
                '}';
    }
}
