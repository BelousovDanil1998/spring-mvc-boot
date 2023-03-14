package ru.javamentor.springmvcboot.DAO;

import ru.javamentor.springmvcboot.model.User;

import java.util.List;

public interface UserDAO {
     List<User> allUsers();

     void save(User user);

    void delete(User user);

    User getById(Long id);

}
