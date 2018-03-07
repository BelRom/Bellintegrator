package ru.bellintegrator.practice.userlog;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class UserLogDAOImpl implements UserLogDAO{

    private final EntityManager em;

    @Autowired
    public UserLogDAOImpl(EntityManager em) {
        this.em = em;
    }


    @Override
    public void register(UserLog userLog) {
        em.persist(userLog);
    }

    @Override
    public boolean login(String login, String password) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<UserLog> criteria = builder.createQuery(UserLog.class);

        Root<UserLog> userLog = criteria.from(UserLog.class);
        criteria.where(builder.equal(userLog.get("login"), login));

        TypedQuery<UserLog> query = em.createQuery(criteria);
        UserLog userLogResult = query.getSingleResult();
        return userLogResult.getPassword().equals(password);
    }
}
