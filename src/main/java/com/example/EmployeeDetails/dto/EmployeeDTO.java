package com.example.EmployeeDetails.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class EmployeeDTO {

    private long id;

    public long getId() {
        return id;
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

    public EmployeeDTO() {
    }

    private String name;

    public EmployeeDTO(long id, String name, String email, long salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    private String email;
    private long salary;
}
