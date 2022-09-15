package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class EmpAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public Integer id;

    @Column(name = "city")
    public String city;
    @Column(name = "country")
    public String country;

    @ManyToOne
    @JoinColumn(name = "emp_id", nullable = false)
    public Employee employee;

    public EmpAddress(String city, String country) {
        this.city = city;
        this.country = country;
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


}
