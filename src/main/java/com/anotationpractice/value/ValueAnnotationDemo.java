package com.anotationpractice.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotationDemo {

    @Value("default_username")
    private String username;

    @Value("${jewel.mail}")
    private String email;
    @Value("${jewel.password}")
    private String password;

    @Value("${JAVA.HOME}")
    private String javaHome;

    //@Value("${HOME}")
    private String directory;

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "ValueAnnotationDemo{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", javaHome='" + javaHome + '\'' +
                ", directory='" + directory + '\'' +
                '}';
    }
}
