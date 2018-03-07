package ru.bellintegrator.practice.office;

import org.springframework.beans.factory.annotation.Autowired;
import ru.bellintegrator.practice.old.person.Person;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class OfficeDAOImpl implements OfficeDAO {

    private final EntityManager em;

    @Autowired
    public OfficeDAOImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Office> all() {
        TypedQuery<Office> query = em.createQuery("SELECT o FROM Office o", Office.class);
        return query.getResultList();
    }

    @Override
    public Office loadById(Long id) {
        return em.find(Office.class, id);
    }

    @Override
    public Office update(Office office) {
        return em.merge(office);
    }

    @Override
    public void save(Office office) {
        em.persist(office);
    }

    @Override
    public void delete(Long id) {
        Office office = em.find(Office.class, id);

        if(office != null){
            em.remove(office);
        }
    }
}
