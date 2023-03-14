package ru.javamentor.springmvcboot.service;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.javamentor.springmvcboot.DAO.UserDAOImpl;
import ru.javamentor.springmvcboot.model.User;

import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements UserService{
    private UserDAOImpl userDAOImpl;

    @Autowired
    public void setUserDAO(UserDAOImpl userDAOImpl) {
        this.userDAOImpl = userDAOImpl;
    }


    public List<User> allUsers() {
        return userDAOImpl.allUsers();
    }

    @Transactional
    public void save(User user) {
        userDAOImpl.save(user);
    }

    @Transactional
    public void delete(User user) {
        userDAOImpl.delete(user);
    }


    public User getById(Long id) {
        return userDAOImpl.getById(id);
    }
}