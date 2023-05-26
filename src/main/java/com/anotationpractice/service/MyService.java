package com.anotationpractice.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public String getService(){
        return "my service method";
    }
}
