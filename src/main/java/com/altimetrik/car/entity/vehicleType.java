package com.altimetrik.car.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

///SELECT vehicles FROM vehicleType vehicles ORDER BY vehicles.vehicleTypeId
@Entity
@NamedQueries({@NamedQuery(name = "vehicleType.findAll",
                query="SELECT vehicles FROM vehicleType vehicles ORDER BY vehicles.vehicleTypeId"),

           /* query = " select vt, vmf, vm " +
                    "from vehicleType vt, vehicleManufacture vmf,  vehicleModelController vm  " +
                    "where  vt.vehicleTypeId = vmf.vehicleTypeId  " +
                    "and  vmf.manufactureId = vm.manufactureId"),*/
            /*query="select type, manufacture.manufactureName from vehicleType type " +
                    "join type.vehicleManufacture manufacture "),*/


})

public class vehicleType {



    @Id
    private String vehicleTypeId;
    private String vehicleTypeName;

//    @OneToMany
//    @JoinTable(joinColumns = @JoinColumn(name="vehicleTypeId"), inverseJoinColumns = @JoinColumn(name="vehicleTypeId"))
//    private Set<vehicleManufacture> manufactures = new HashSet<vehicleManufacture>();


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

//    public Set<vehicleManufacture> getManufactures() {
//        return manufactures;
//    }
//
//    public void setManufactures(Set<vehicleManufacture> manufactures) {
//        this.manufactures = manufactures;
//    }

    @Override
    public String toString() {
        return "vehicleType{" +
                "vehicleTypeId='" + vehicleTypeId + '\'' +
                ", vehicleTypeName='" + vehicleTypeName + '\'' +
                '}';
    }
}
