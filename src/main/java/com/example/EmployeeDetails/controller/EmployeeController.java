package com.example.EmployeeDetails.controller;


import com.example.EmployeeDetails.dto.EmployeeDTO;
import com.example.EmployeeDetails.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping
    public ResponseEntity<EmployeeDTO> createEmployee(@RequestBody EmployeeDTO employeeDTO){
       EmployeeDTO savedEmployee= employeeService.createEmployee(employeeDTO);
       return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

@GetMapping("{id}")
    public  ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable("id") Long employeeId){
        EmployeeDTO employeeDTO=employeeService.getEmployeeById(employeeId);
        return ResponseEntity.ok(employeeDTO);
    }

    @GetMapping
    public  ResponseEntity<List<EmployeeDTO>> getAllEmployees(){
        List<EmployeeDTO> employees=employeeService.getAllEmployee();
        return  ResponseEntity.ok(employees);
    }

    @PutMapping("{id}")
    public ResponseEntity<EmployeeDTO> updateEmployee(@PathVariable("id") Long employeeId,@RequestBody EmployeeDTO updatesEmployee){
       EmployeeDTO employeeDTO= employeeService.updateEmployee(employeeId,updatesEmployee);
        return  ResponseEntity.ok(employeeDTO);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployeeById(@PathVariable("id") Long emplyeeId){
        employeeService.deleteEmployeeById(emplyeeId);
        return ResponseEntity.ok("Emplyee Deleted Successfully!.");
    }
}
