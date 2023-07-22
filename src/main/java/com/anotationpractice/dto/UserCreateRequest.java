package com.anotationpractice.dto;

public class UserCreateRequest {
    private String name;
    private String email;

    private String address;

    private String city;

    private long deptId;

    public UserCreateRequest(String name, String email, String address, String city) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.city = city;
    }

    public UserCreateRequest(String name, String email, String address, String city, long deptId) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.city = city;
        this.deptId = deptId;
    }

    public UserCreateRequest() {
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

    public long getDeptId() {
        return deptId;
    }

    public void setDeptId(long deptId) {
        this.deptId = deptId;
    }
}
