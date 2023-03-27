package com.example.springbootdemo.model;

import jakarta.persistence.*;



@Entity
@Table(name="department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long department_id;

    @Column(name="department_name")
    private String department_name;

    public Department(long department_id, String department_name, long department_employees) {
        this.department_id=department_id;
        this.department_name = department_name;
        this.department_employees = department_employees;
    }

    @Column(name="department_employees")
    private long department_employees;



    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public long getDepartment_employees() {
        return department_employees;
    }

    public void setDepartment_employees(long department_employees) {
        this.department_employees = department_employees;
    }

    public long getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(long department_id) {
        this.department_id = department_id;
    }


}
