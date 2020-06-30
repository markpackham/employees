package com.example.codeclan.employees.repositories;

import com.example.codeclan.employees.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
