package com.example.Spring_Data_JPA_Hibernate.jpa;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.Spring_Data_JPA_Hibernate.entity.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
@NamedQuery(name = "find_all_persons", query = "select p from Person p")
public class PersonJpaRepository {

    @PersistenceContext
    EntityManager em;

    public Person findById(int id) {
        return em.find(Person.class, id);
    }

    public Person update(Person person) {
        return em.merge(person);
    }

    public Person insert(Person person) {
        return em.merge(person);
    }

    public void deleteById(int id) {
        Person person = findById(id);
        em.remove(person);
    }

    public List<Person> findAll() {
        return em.createNamedQuery("find_all_persons", Person.class).getResultList();
    }
}
