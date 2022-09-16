package com.example.demo.services;

import com.example.demo.entity.EmpAddress;
import com.example.demo.repository.EmpAddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
    public List<EmpAddress> getAddressByEmpId(int empId){
        List<EmpAddress> empAddresses = empAddressRepository.findAll();
        return empAddresses.stream().filter(emp -> emp.empId == empId).collect(Collectors.toList());
    }
}
