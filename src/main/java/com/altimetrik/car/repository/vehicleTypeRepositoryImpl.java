package com.altimetrik.car.repository;

import com.altimetrik.car.entity.vehicleType;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class vehicleTypeRepositoryImpl implements vehicleTypeRepository{

    @PersistenceContext
    private EntityManager entityManager;

    public List<vehicleType> findAll(){
        TypedQuery<vehicleType> query;
        query = entityManager.createNamedQuery("vehicleType.findAll",vehicleType.class);
        return query.getResultList();
    }
}
