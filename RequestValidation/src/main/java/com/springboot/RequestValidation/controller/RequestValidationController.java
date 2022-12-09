package com.springboot.RequestValidation.controller;

import com.springboot.RequestValidation.dto.EmployeeDto;
import com.springboot.RequestValidation.entities.Employee;
import com.springboot.RequestValidation.exception.EmployeeNotFoundException;
import com.springboot.RequestValidation.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/reqValidation")
public class RequestValidationController {

    @Autowired
    EmployeeServiceImpl employeeServiceImpl;

    @PostMapping("/saveEmployee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody @Valid EmployeeDto employeeDto) {
        return new ResponseEntity<>(employeeServiceImpl.saveEmployee(employeeDto), HttpStatus.CREATED);
    }

    @GetMapping("/fetchEmpById/{empId}")
    public ResponseEntity<Employee> fetchEmpById(@PathVariable int empId) throws EmployeeNotFoundException {
        return ResponseEntity.ok(employeeServiceImpl.fetchByEmployeeId(empId));
    }

}
