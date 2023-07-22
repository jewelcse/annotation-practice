package com.anotationpractice.dto;

public class DepartmentCreateRequest {

    private String name;

    public DepartmentCreateRequest() {
    }

    public DepartmentCreateRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
