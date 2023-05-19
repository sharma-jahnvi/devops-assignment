package com.example.springbootdemo.controller;

import com.example.springbootdemo.exception.ResourceNotFoundException;
import com.example.springbootdemo.model.Department;
import com.example.springbootdemo.model.Employee;
import com.example.springbootdemo.repository.DepartmentRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DepartmentController {




    @GetMapping("/department")
    public Department getDepartment(){
        return new Department(1,"Finance",500);
    }

    @GetMapping("/departments")
    public List<Department> getDepartments(){
        List<Department> departments= new ArrayList<>();
        departments.add(new Department(2,"Human Resources",200));
        departments.add(new Department(3,"Accounting",600));
        departments.add(new Department(4,"IT",1500));
        departments.add(new Department(5,"Operations",300));

        return departments;

    }

    //use of PathVAARIABLE
    @GetMapping("/department/{department_id}/{department_name}/{department_employees}")
    public Department departmentVariable(@PathVariable("department_id") long department_id,
                                         @PathVariable("department_name") String department_name,
                                         @PathVariable("department_employees") long department_employees)
    {
        return new Department(department_id,department_name,department_employees);
    }

    //use of QUERYPARAMS
    @GetMapping("/department/query")
    public Department departmentParam(@RequestParam("department_id") long department_id,
                                         @RequestParam("department_name") String department_name,
                                      @RequestParam("department_employees") long department_employees
                                         )
    {
        return new Department(department_id,department_name,department_employees);
    }





}
