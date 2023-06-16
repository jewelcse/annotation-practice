package com.anotationpractice.repository;

import com.anotationpractice.entity.User;

import java.util.List;

public interface UserRepository {

    List<User> findAll();
    User findById(Long id);
    User save(User user);
    User update(User user);
    void delete(Long id);
}
