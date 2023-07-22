package com.anotationpractice.serviceImpl;


import com.anotationpractice.dto.AssignUserToDepartmentRequest;
import com.anotationpractice.dto.DepartmentCreateRequest;
import com.anotationpractice.entity.Department;
import com.anotationpractice.entity.User;
import com.anotationpractice.repository.DepartmentRepository;
import com.anotationpractice.repository.UserRepository;
import com.anotationpractice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private UserRepository userRepository;


    @Override
    public Department save(DepartmentCreateRequest request) {
        Department department = new Department();
        department.setName(request.getName());

        return departmentRepository.save(department);
    }

    @Override
    public Department findDepartmentById(Long id) {
        return departmentRepository.findById(id)
                .orElseThrow( () -> new RuntimeException("department not found! for id: "+id));
    }

    @Override
    public List<Department> getDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public void assignUser(AssignUserToDepartmentRequest request) {

        Optional<Department> department = departmentRepository.findById(request.getDeptId());
        if (department.isEmpty()){
            throw new RuntimeException("department not found for id: "  +request.getDeptId());
        }
        Optional<User> user  = userRepository.findById(request.getUserId());
        if (user.isEmpty()){
            throw new RuntimeException("user not found for id: "  +request.getUserId());
        }
        List<User> userList  = department.get().getUsers();
        userList.add(user.get());
        departmentRepository.save(department.get());
    }


}
