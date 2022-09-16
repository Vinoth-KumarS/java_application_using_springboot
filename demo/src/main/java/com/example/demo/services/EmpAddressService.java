package com.example.demo.services;

import com.example.demo.entity.EmpAddress;
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmpAddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpAddressService {
    final
    EmpAddressRepository empAddressRepository;

    public EmpAddressService(EmpAddressRepository empAddressRepository) {
        this.empAddressRepository = empAddressRepository;
    }
    public List<EmpAddress> getAllAddress(){
        return empAddressRepository.findAll();
    }
}
