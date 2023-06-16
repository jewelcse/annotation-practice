package com.anotationpractice.controller;


import com.anotationpractice.entity.User;
import com.anotationpractice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/listHeaders")
    public ResponseEntity<String> listAllHeaders(
            @RequestHeader Map<String, String> headers) {
        headers.forEach((key, value) -> {
            System.out.println(String.format("Header '%s' = %s", key, value));
        });

        return new ResponseEntity<>(
                String.format("Listed %d headers", headers.size()), HttpStatus.OK);
    }

    @GetMapping("/listAllHeaders2")
    public void getAllHeaders2(@RequestParam long id){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();

        // get specific header
        System.out.println(request.getRemoteUser());
        System.out.println(request.getHeader("Accept"));
        System.out.println(request.getQueryString());

        // get the requested url
        String url = request.getRequestURI();
        System.out.println("the requested url : "+ url);

        // get the requested url with query string
        StringBuffer newUrl = request.getRequestURL();
        String queryString = request.getQueryString();
        System.out.println("query string: " + queryString);
        System.out.println("full url: "+ newUrl.append("?").append(queryString));

        System.out.println("URL : " + request.getRequestURL());;

        // get all headers at a time
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            String headerValue = request.getHeader(headerName);
            System.out.println(headerName + ": " + headerValue);
        }
    }


    @PostMapping("/users")
    public User saveUser(@RequestBody User user) {
        System.out.println(user.getName() + " " + user.getEmail());
        return userService.createUser(user);
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
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUserById(@PathVariable Long id) {
        userService.deleteUser(id);
    }




}
