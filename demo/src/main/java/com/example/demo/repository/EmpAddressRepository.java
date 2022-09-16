package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.EmpAddress;

import java.util.List;


public interface EmpAddressRepository extends JpaRepository<EmpAddress, Integer> {


}
