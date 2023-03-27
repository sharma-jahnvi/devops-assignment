package com.example.springbootdemo.repository;

import com.example.springbootdemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    //all CRUD METHODS to interact with database
}
