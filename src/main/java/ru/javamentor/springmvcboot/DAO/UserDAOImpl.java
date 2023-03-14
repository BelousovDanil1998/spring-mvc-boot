package ru.javamentor.springmvcboot.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Component;
import ru.javamentor.springmvcboot.model.User;

import java.util.List;


@Component
public class UserDAOImpl implements UserDAO {
    @PersistenceContext
    private EntityManager entityManager;

    public UserDAOImpl() {
    }

    public List<User> allUsers() {
        return entityManager.createQuery("SELECT user FROM User user", User.class).getResultList();
    }


    public void save(User user) {
        User managed = entityManager.merge(user);
        entityManager.persist(managed);
    }


    public void delete(User user) {
        User managed = entityManager.merge(user);
        entityManager.remove(managed);
    }


    public User getById(Long id) {
        return entityManager.find(User.class, id);
    }
}