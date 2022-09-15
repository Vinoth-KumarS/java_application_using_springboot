package com.example.demo.entity;


import java.util.List;
import javax.persistence.*;



@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column(length = 45, nullable = false, name = "first_name")
    private String firstName;
    @Column(length = 45, nullable = false, name = "last_name")
    private String lastName;

    @OneToMany(mappedBy = "id")
    public List<EmpAddress> empAddresses;

    public Employee(String firstName, String lastName, List<EmpAddress> empAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.empAddresses = empAddress;
    }

    public Employee() {

    }

    public List<EmpAddress> getEmpAddresses() {
        return empAddresses;
    }

    public void setEmpAddresses(List<EmpAddress> empAddresses) {
        this.empAddresses = empAddresses;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "id='" + id + '\'' +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}