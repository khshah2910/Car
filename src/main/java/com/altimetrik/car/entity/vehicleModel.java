package com.altimetrik.car.entity;

import javax.persistence.*;
import java.util.List;

@Entity

@NamedQueries({@NamedQuery(name = "vehicleModel.findAll",
        query="SELECT vm FROM vehicleModel vm ORDER BY vm.modelId"),

})

public class vehicleModel {
    @Id
    private String modelId;
    private String modelName;
    private String year;
    private double rating;

    @ManyToOne(cascade = CascadeType.ALL)
    private vehicleManufacture vehicleManufacture;


    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public com.altimetrik.car.entity.vehicleManufacture getVehicleManufacture() {
        return vehicleManufacture;
    }

    public void setVehicleManufacture(com.altimetrik.car.entity.vehicleManufacture vehicleManufacture) {
        this.vehicleManufacture = vehicleManufacture;
    }

    @Override
    public String toString() {
        return "vehicleModelController{" +
                "modelId='" + modelId + '\'' +
                ", modelName='" + modelName + '\'' +
                ", year='" + year + '\'' +
                ", rating=" + rating +
                '}';
    }
}
