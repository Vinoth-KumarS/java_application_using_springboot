package com.example.demo.services;

import com.example.demo.entity.EmpAddress;
import com.example.demo.entity.Employee;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import com.example.demo.repository.EmpAddressRepository;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    final
    EmployeeRepository employeeRepository;
    final
    EmpAddressRepository empAddressRepository;


    public EmployeeService(EmployeeRepository employeeRepository, EmpAddressRepository empAddressRepository) {
        this.employeeRepository = employeeRepository;
        this.empAddressRepository = empAddressRepository;
    }


    public List<Employee> getAllEmployee(){
        List<EmpAddress> empAddress = empAddressRepository.findAll();
        List<Employee> employees = employeeRepository.findAll();

        employees.forEach((emp)-> {
            empAddress.forEach((empAdd) -> {
                if (emp.id == empAdd.empId) {
                    emp.empAddresses.add(empAdd);
                }
            });
        });
        return employees;
    }
    public Employee addEmp(Employee emp) {

  Employee employee =  employeeRepository.save(emp);
        employee.empAddresses.forEach((empAdd) -> {
            empAdd.empId = emp.id;
             empAddressRepository.save(empAdd);
        });

return employee;
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
