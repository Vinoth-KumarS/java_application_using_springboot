package com.example.demo.services;

import com.example.demo.entity.EmpAddress;
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmpAddressRepository;

import java.util.List;

public class EmpAddressService {
    final
    EmpAddressRepository empAddressRepository;

    public EmpAddressService(EmpAddressRepository empAddressRepository) {
        this.empAddressRepository = empAddressRepository;
    }
    public List<EmpAddress> getAllEmployee(){
        return empAddressRepository.findAll();
    }
}
