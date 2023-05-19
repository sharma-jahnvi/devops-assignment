package com.example.springbootdemo.controller;


import com.example.springbootdemo.exception.ResourceNotFoundException;
import com.example.springbootdemo.model.Employee;
import com.example.springbootdemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//handles all requests for a REST API
@RestController
@RequestMapping("api/v1/employees")    //provides a base url
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

   @GetMapping
    public List<Employee> getAllEmployees(){

       return employeeRepository.findAll();
    }

    //build create employee rest API method
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){ //converts JSON to JAVA objects
        return employeeRepository.save(employee);
    }

    //build update employee rest api method
    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeId( @PathVariable long id){

       Employee employee=employeeRepository.findById(id).orElseThrow(() ->new ResourceNotFoundException("Employee " + "not found with id :" +id));
       return ResponseEntity.ok(employee);   //ok method provides 200 ok status message
    }



    @PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable long id,  @RequestBody Employee employeedetails) {//client will call this api and
        //send details for updating
        Employee updateEmployee = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee " +
                "not found with id :" + id));
        updateEmployee.setFirstName(employeedetails.getFirstName());  //fetching from client and saving to repo
        updateEmployee.setFirstName(employeedetails.getLastName());
        updateEmployee.setFirstName(employeedetails.getEmail());

        employeeRepository.save(updateEmployee);

        return ResponseEntity.ok(updateEmployee);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Employee> deleteEmployeeId( @PathVariable long id){
        Employee delemployee=employeeRepository.findById(id).orElseThrow(() ->new ResourceNotFoundException("Employee " +
                "not found with id :" +id));
        employeeRepository.delete(delemployee);

        return  new ResponseEntity<>(HttpStatus.NO_CONTENT); //not retuning anything to client

    }



    }


