package com.example.codeclan.employees.models;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private Long id;
    private String firstname;
    private String lastname;
    private String employeeNumber;
    private List<Project> projects;

    public Employee(String firstname, String lastname, String employeeNumber, Project project) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.employeeNumber = employeeNumber;
        this.projects = new ArrayList<>();
    }

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
