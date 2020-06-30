package com.example.codeclan.employees;

import com.example.codeclan.employees.models.Department;
import com.example.codeclan.employees.models.Employee;
import com.example.codeclan.employees.models.Project;
import com.example.codeclan.employees.repositories.DepartmentRepository;
import com.example.codeclan.employees.repositories.EmployeeRepository;
import com.example.codeclan.employees.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeesApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment(){
		Department department1 = new Department("Brain Eating");
		departmentRepository.save(department1);

		Employee employee1 = new Employee("Bob","Smith","1A",department1);
		employeeRepository.save(employee1);
	}

}
