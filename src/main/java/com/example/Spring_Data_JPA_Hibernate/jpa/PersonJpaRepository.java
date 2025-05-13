package com.example.Spring_Data_JPA_Hibernate.jpa;

import org.springframework.stereotype.Repository;

import com.example.Spring_Data_JPA_Hibernate.entity.Person;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PersonJpaRepository {

    EntityManager em;

    public Person findById(int id) {
        return em.find(Person.class, id);
    }
}
