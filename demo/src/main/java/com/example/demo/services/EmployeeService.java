package com.example.demo.services;

import com.example.demo.entity.Employee;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import com.example.demo.repository.EmployeeRepository;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    final
    EmployeeRepository employeeRepository;


    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }
    public Employee addEmp(Employee emp) {
        return employeeRepository.save(emp);
    }

    public Employee editEmp(Employee e) {
        Stream<Employee> selectedEmp = getAllEmployee().stream().filter(emp -> Objects.equals(emp.id, e.id));
        selectedEmp.forEach(emp -> {
            emp.setFirstName((e.getFirstName()));
            emp.setLastName((e.getLastName()));
        });
        return employeeRepository.save(e);
    }

    public String deleteEmp(int id){
        System.out.println(employeeRepository);
         employeeRepository.deleteById(id);
         return "Employee " + id + " is Removed Successfully";

    }

}
