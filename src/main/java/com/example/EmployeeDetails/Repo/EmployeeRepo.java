package com.example.EmployeeDetails.Repo;

import com.example.EmployeeDetails.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
