package com.anotationpractice.service;

import com.anotationpractice.dto.AssignUserToDepartmentRequest;
import com.anotationpractice.dto.DepartmentCreateRequest;
import com.anotationpractice.entity.Department;

import java.util.List;

public interface DepartmentService {


    Department save(DepartmentCreateRequest request);

    Department findDepartmentById(Long id);


    List<Department> getDepartments();

    void assignUser(AssignUserToDepartmentRequest request);
}
