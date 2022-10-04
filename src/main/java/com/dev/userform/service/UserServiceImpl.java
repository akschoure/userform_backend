package com.dev.userform.service;

import com.dev.userform.dao.UserRepository;
import com.dev.userform.pojos.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    public UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(Integer id) {

        return userRepository.findById(id).orElseThrow();
    }

    @Override
    public User addUser(User user){
        return userRepository.save(user);
    }

    @Override
    public String deleteUser(Integer id){
         userRepository.deleteById(id);
         return "deleted user "+id;
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

}
