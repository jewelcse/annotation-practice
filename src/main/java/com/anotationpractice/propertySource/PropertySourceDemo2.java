package com.anotationpractice.propertySource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PropertySourceDemo2 {

    @Autowired
    private Environment environment;


    private String host;
    private String port;
    private String user;
    private String password;
    private String dbusername;


    public String getHost() {
        return environment.getProperty("gmail.host");
    }

    public String getPort() {
        return environment.getProperty("gmail.port");
    }

    public String getUser() {
        return environment.getProperty("gmail.user");
    }

    public String getPassword() {
        return environment.getProperty("gmail.password");
    }

    public String getDbusername() {
        return environment.getProperty("spring.database.username");
    }

    @Override
    public String toString() {
        return "PropertySourceDemo2{" +
                "environment=" + environment +
                ", host='" + host + '\'' +
                ", port='" + port + '\'' +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", dbusername='" + dbusername + '\'' +
                '}';
    }
}
