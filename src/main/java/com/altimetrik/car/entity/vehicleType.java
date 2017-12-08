package com.altimetrik.car.entity;

import javax.persistence.*;


@Entity
@NamedQueries({@NamedQuery(name = "vehicleType.findAll", query = "SELECT vehicles FROM vehicleType vehicles ORDER BY vehicles.typeId "),
})

public class vehicleType {
    @Id
    private String typeId;
    private String vehicleTypeName;

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    @Override
    public String toString() {
        return "vehicleType{" +
                "typeId='" + typeId + '\'' +
                ", vehicleTypeName='" + vehicleTypeName + '\'' +
                '}';
    }
}
