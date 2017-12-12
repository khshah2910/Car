package com.altimetrik.car.repository;

import com.altimetrik.car.entity.vehicleManufacture;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class vehicleManufactureRepositoryImpl implements vehicleManufactureRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<vehicleManufacture> findAll() {
        TypedQuery<vehicleManufacture> query;
        query = entityManager.createNamedQuery("vehicleManufacture.findAll",vehicleManufacture.class);
        return query.getResultList();
    }
}
