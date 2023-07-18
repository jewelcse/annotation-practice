package com.anotationpractice.dto;

public class UserCreateResponse {

    private String name;
    private String email;
    private String address;
    private String city;

    public UserCreateResponse(String name, String email, String address, String city) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}