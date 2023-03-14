package ru.javamentor.springmvcboot.service;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import ru.javamentor.springmvcboot.DAO.UserDAO;
import ru.javamentor.springmvcboot.model.User;

import java.util.List;


@Service
public class UserService {
    private UserDAO userDAO;

    @Autowired
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }


    public List<User> allUsers() {
        return userDAO.allUsers();
    }


    public void save(User user) {
        userDAO.save(user);
    }


    public void delete(User user) {
        userDAO.delete(user);
    }


    public User getById(Long id) {
        return userDAO.getById(id);
    }
}