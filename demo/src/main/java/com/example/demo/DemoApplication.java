package com.example.demo;

import com.example.demo.entity.EmpAddress;
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;


@SpringBootApplication
public class DemoApplication {

	final EmployeeRepository employeeRepository;

	public DemoApplication(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	public void run(String... args) throws Exception {


	}


}
