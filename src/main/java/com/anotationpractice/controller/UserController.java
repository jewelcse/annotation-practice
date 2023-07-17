package com.anotationpractice.controller;


import com.anotationpractice.dto.UserCreateRequest;
import com.anotationpractice.dto.UserCreateResponse;
import com.anotationpractice.entity.User;
import com.anotationpractice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/users")
    public User saveUser(@RequestBody User user) {
        System.out.println(user.getName() + " " + user.getEmail());
        return userService.createUser(user);
    }

    @PostMapping("/users2")
    public UserCreateResponse saveUser2(@RequestBody UserCreateRequest request) {

        return userService.createUser(request);
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUserById(@PathVariable int id) {
        userService.deleteUser(id);
    }




}
