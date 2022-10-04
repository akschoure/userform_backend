package com.dev.userform.controller;


import com.dev.userform.pojos.User;
import com.dev.userform.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserRestController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping("/user")
    public ResponseEntity<?> addUser(@RequestBody User user) {

        return new ResponseEntity<>(userService.addUser(user), HttpStatus.CREATED);


    }
}
