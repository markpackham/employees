package com.example.codeclan.employees.models;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private Long id;
    private String name;
    private int days;
    private List<Employee> employees;

    public Project(String name, int days, Employee employee) {
        this.name = name;
        this.days = days;
        this.employees = new ArrayList<>();
    }

    public Project(){

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

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
