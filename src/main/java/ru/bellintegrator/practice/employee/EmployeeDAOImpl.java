package ru.bellintegrator.practice.employee;

import org.springframework.beans.factory.annotation.Autowired;
import ru.bellintegrator.practice.office.Office;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO{

    private final EntityManager em;

    @Autowired
    public EmployeeDAOImpl(EntityManager em) {
        this.em = em;
    }


    @Override
    public List<Employee> all() {
        TypedQuery<Employee> query = em.createQuery("SELECT e FROM Employee e", Employee.class);
        return query.getResultList();
    }

    @Override
    public Employee loadById(Long id) {
        return em.find(Employee.class, id);
    }

    @Override
    public Employee update(Employee employee) {
        return em.merge(employee);
    }

    @Override
    public void save(Employee employee) {
        em.persist(employee);
    }

    @Override
    public void delete(Long id) {
        Employee employee = em.find(Employee.class, id);

        if(employee != null){
            em.remove(employee);
        }
    }
}
