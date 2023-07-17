package com.anotationpractice.repository;

import com.anotationpractice.entity.Department;
import com.anotationpractice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {

}
