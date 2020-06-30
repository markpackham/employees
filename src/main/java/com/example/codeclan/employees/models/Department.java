package com.example.codeclan.employees.models;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private Long id;
    private String name;
    private List<Employee> employees;

    public Department(String name, Employee employee) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public Department(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
