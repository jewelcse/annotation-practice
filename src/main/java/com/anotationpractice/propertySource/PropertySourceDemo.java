package com.anotationpractice.propertySource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertySourceDemo {

    @Value("${gmail.host}")
    private String host;
    @Value("${gmail.port}")
    private String port;
    @Value("${gmail.user}")
    private String user;
    @Value("${gmail.password}")
    private String password;

    @Override
    public String toString() {
        return "PropertySourceDemo{" +
                "host='" + host + '\'' +
                ", port='" + port + '\'' +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
