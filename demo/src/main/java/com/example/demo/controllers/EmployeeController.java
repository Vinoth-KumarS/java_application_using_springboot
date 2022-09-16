package com.example.demo.controllers;

import com.example.demo.entity.EmpAddress;
import com.example.demo.entity.Employee;
import com.example.demo.services.EmpAddressService;
import com.example.demo.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/emp")
public class EmployeeController {

    final
    EmployeeService employeeService;
    EmpAddressService empAddressService;

    public EmployeeController(EmployeeService employeeService, EmpAddressService empAddressService) {
        this.employeeService = employeeService;
        this.empAddressService = empAddressService;
    }

    @GetMapping(path = "/get/all")
    public List<Employee> getAll(){
        return  employeeService.getAllEmployee();
    }

    @PostMapping(path = "/add")
    public Employee  add(@RequestBody Employee emp){
        return  employeeService.addEmp(emp);
    }

    @PutMapping(path ="/edit")
    public Employee  edit(@RequestBody Employee emp){
        return  employeeService.editEmp(emp);
    }

    @DeleteMapping(path="/delete")
    public String delete(@RequestParam int id){
        return employeeService.deleteEmp(id);
    }


}
