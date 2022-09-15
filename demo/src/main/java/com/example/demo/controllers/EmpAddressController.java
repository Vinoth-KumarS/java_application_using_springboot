package com.example.demo.controllers;


import com.example.demo.entity.EmpAddress;
import com.example.demo.services.EmpAddressService;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(path = "/address")
public class EmpAddressController {
   final EmpAddressService empAddressService;

    public EmpAddressController(EmpAddressService empAddressService) {
        this.empAddressService = empAddressService;
    }

    @GetMapping(path = "/get/address")
    public List<EmpAddress> getAll(){
        return  empAddressService.getAllEmployee();
    }


}
