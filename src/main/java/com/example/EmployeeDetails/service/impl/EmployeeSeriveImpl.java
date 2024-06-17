package com.example.EmployeeDetails.service.impl;

import com.example.EmployeeDetails.Mapper.EmployeeMapper;
import com.example.EmployeeDetails.Repo.EmployeeRepo;
import com.example.EmployeeDetails.dto.EmployeeDTO;
import com.example.EmployeeDetails.entity.Employee;
import com.example.EmployeeDetails.exception.RsourceNotFoundException;
import com.example.EmployeeDetails.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class EmployeeSeriveImpl implements EmployeeService {


    private EmployeeRepo employeeRepo;
    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
        Employee employee= EmployeeMapper.mapToEmployee(employeeDTO);
        Employee savedEmployee= employeeRepo.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDTO getEmployeeById(Long employeeId) {
       Employee employee= employeeRepo.findById(employeeId)
                .orElseThrow(()-> new RsourceNotFoundException("Employee is not exists with given Id : "+ employeeId));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }

    @Override
    public List<EmployeeDTO> getAllEmployee() {
        List<Employee> employees=employeeRepo.findAll();
        return  employees.stream().map((employee) -> EmployeeMapper.mapToEmployeeDto(employee))
                .collect(Collectors.toList());
    }

    @Override
    public EmployeeDTO updateEmployee(Long employeeId, EmployeeDTO updatedEmployee) {
        Employee employee= employeeRepo.findById(employeeId).orElseThrow(()-> new RsourceNotFoundException("Employee is not exists with given Id : "+ employeeId));
        employee.setName(updatedEmployee.getName());
        employee.setEmail(updatedEmployee.getEmail());
        employee.setSalary(updatedEmployee.getSalary());
        Employee updatedEmployeeObj= employeeRepo.save(employee);
        return EmployeeMapper.mapToEmployeeDto(updatedEmployeeObj);
    }

    @Override
    public void deleteEmployeeById(Long employeeId) {
        Employee employee=employeeRepo.findById(employeeId).orElseThrow(()->new RsourceNotFoundException("Employee is not exists with given Id : \"+ employeeId"));
        employeeRepo.deleteById(employeeId);
    }
}
