package com.springboot.RequestValidation.service;

import com.springboot.RequestValidation.dto.EmployeeDto;
import com.springboot.RequestValidation.entities.Employee;
import com.springboot.RequestValidation.exception.EmployeeNotFoundException;

public interface EmployeeService {

    Employee saveEmployee(EmployeeDto employeeDto);
    Employee fetchByEmployeeId(int empId) throws EmployeeNotFoundException;

}
