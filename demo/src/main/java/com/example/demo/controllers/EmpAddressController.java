package com.example.demo.controllers;


import com.example.demo.entity.EmpAddress;
import com.example.demo.services.EmpAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(path = "/address")
public class EmpAddressController {

    final
    EmpAddressService empAddressService;
    @Autowired
    public EmpAddressController(EmpAddressService empAddressService) {
        this.empAddressService = empAddressService;
    }
    @GetMapping(path = "/getAllAddress")
    public List<EmpAddress> getAll(){
        return  empAddressService.getAllAddress();
    }
    @GetMapping(path = "/getAddress")
    public List<EmpAddress> getAddressByEmpId(@RequestParam int empId){
        return  empAddressService.getAddressByEmpId(empId);
    }


}
