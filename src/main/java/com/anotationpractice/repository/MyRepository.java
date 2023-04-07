package com.anotationpractice.repository;


import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {

    public String getRepository(){
        return "my repository is called";
    }
}
