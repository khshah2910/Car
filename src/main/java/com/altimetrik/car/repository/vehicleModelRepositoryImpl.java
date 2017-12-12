package com.altimetrik.car.repository;

import com.altimetrik.car.entity.*;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class vehicleModelRepositoryImpl implements vehicleModelRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<vehicleModel> findAll(){
        TypedQuery<vehicleModel> query;
        query = entityManager.createNamedQuery("vehicleModel.findAll",vehicleModel.class);
        return query.getResultList();
    }
}
