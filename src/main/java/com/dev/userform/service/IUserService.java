package com.dev.userform.service;

import com.dev.userform.pojos.User;

import java.util.List;

public interface IUserService {
    public List<User> getUsers();

    User getUser(Integer id);

    User addUser(User user);

    String deleteUser (Integer id);

    User updateUser(User user);
}
