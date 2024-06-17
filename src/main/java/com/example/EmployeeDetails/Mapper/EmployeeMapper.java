package com.example.EmployeeDetails.Mapper;

import com.example.EmployeeDetails.dto.EmployeeDTO;
import com.example.EmployeeDetails.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDTO mapToEmployeeDto(Employee employee){
        return new EmployeeDTO(
            employee.getId(),
                employee.getName(),
                employee.getEmail(),
                employee.getSalary()
        );
    }
    public static Employee mapToEmployee(EmployeeDTO employeeDTO){
        return new Employee(
                employeeDTO.getId(),
                employeeDTO.getName(),
                employeeDTO.getEmail(),
                employeeDTO.getSalary()
        );
    }
}
