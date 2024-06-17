package com.example.EmployeeDetails.service;

import com.example.EmployeeDetails.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {
    EmployeeDTO createEmployee(EmployeeDTO employeeDTO);

    EmployeeDTO getEmployeeById(Long employeeId);

    List<EmployeeDTO> getAllEmployee();

    EmployeeDTO updateEmployee(Long employeeId, EmployeeDTO updatedEmployee);

    void  deleteEmployeeById(Long employeeId);
}
