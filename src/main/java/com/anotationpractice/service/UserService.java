package com.anotationpractice.service;

import com.anotationpractice.dto.UserCreateRequest;
import com.anotationpractice.dto.UserCreateResponse;
import com.anotationpractice.entity.User;

import java.util.List;

public interface UserService {

    // save
    UserCreateResponse save(UserCreateRequest request);

    // get
    User getUser(Long id);

    // all user
    List<User> getUsers();

    // delete
    void delete(Long id);

}
