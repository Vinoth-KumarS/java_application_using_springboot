package com.example.demo.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "address")
public class EmpAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    public Integer id;

    @Column(name = "city")
    public String city;
    @Column(name = "country")
    public String country;

    @Column(name = "emp_id")
    public int empId;

    public EmpAddress(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public EmpAddress(Set<EmpAddress> empAddresses) {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public EmpAddress() {

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "EmpAddress{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
