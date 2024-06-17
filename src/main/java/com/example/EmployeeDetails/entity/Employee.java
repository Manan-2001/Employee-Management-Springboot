package com.example.EmployeeDetails.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Table(name = "Employees")
public class Employee {

    public long getId() {
        return id;
    }

    public Employee() {
    }

    public Employee(long id, String name, String email, long salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String email;
    private long salary;


}
