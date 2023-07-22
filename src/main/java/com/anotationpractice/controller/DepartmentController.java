package com.anotationpractice.controller;

import com.anotationpractice.dto.AssignUserToDepartmentRequest;
import com.anotationpractice.dto.DepartmentCreateRequest;
import com.anotationpractice.dto.UserCreateRequest;
import com.anotationpractice.dto.UserCreateResponse;
import com.anotationpractice.entity.Department;
import com.anotationpractice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    @PostMapping("/departments")
    public ResponseEntity<Department> createDepartment(@RequestBody DepartmentCreateRequest request){
        return new ResponseEntity<>(departmentService.save(request), HttpStatus.CREATED);
    }

    @GetMapping("/departments")
    public ResponseEntity<List<Department>> getDepartments(){
        return ResponseEntity.ok(departmentService.getDepartments());
    }

    @GetMapping("/departments/{id}")
    public ResponseEntity<Department> getDepartment(@PathVariable Long id){
        return ResponseEntity.ok(departmentService.findDepartmentById(id));
    }

    @PostMapping("/departments/assign/user")
    public ResponseEntity<String> assignUserToDepartment(@RequestBody AssignUserToDepartmentRequest request){
        departmentService.assignUser(request);
        return ResponseEntity.ok("user add success");
    }


}
