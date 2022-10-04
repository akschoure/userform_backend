package com.dev.userform.controller;


import com.dev.userform.pojos.User;
import com.dev.userform.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserRestController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUser(@PathVariable Integer id){
        return ResponseEntity.ok(userService.getUser(id));
    }


    @PostMapping("/user")
    public ResponseEntity<User> addUser(@RequestBody User user) {

        return new ResponseEntity<>(userService.addUser(user), HttpStatus.CREATED);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Integer id){
        return ResponseEntity.ok(userService.deleteUser(id));
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<?> updateUser (@RequestBody User user , @PathVariable Integer id){
        return ResponseEntity.ok(userService.updateUser(user));
    }
}
