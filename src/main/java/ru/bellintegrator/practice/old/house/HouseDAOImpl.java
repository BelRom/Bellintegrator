package ru.bellintegrator.practice.old.house;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class HouseDAOImpl implements HouseDAO {

    private final EntityManager em;

    @Autowired
    public HouseDAOImpl(EntityManager em) {
        this.em = em;
    }


    @Override
    public List<House> all() {
        TypedQuery<House> query = em.createQuery("SELECT h FROM House h", House.class);
        return query.getResultList();
    }

    @Override
    public House loadById(Long id) {
        return em.find(House.class, id);
    }

    @Override
    public void save(House house) {
        em.persist(house);
    }
}
