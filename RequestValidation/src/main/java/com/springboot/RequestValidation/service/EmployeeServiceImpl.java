package com.springboot.RequestValidation.service;

import com.springboot.RequestValidation.dto.EmployeeDto;
import com.springboot.RequestValidation.entities.Employee;
import com.springboot.RequestValidation.exception.EmployeeNotFoundException;
import com.springboot.RequestValidation.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public Employee saveEmployee(EmployeeDto employeeDto) {
        Employee emp = new Employee(0, employeeDto.getEmpId(), employeeDto.getEmpName(),
                employeeDto.getEmpEmail(), employeeDto.getEmpPhoneNumber(), employeeDto.getEmpAge(),
                employeeDto.getEmpGender());
        return employeeRepo.save(emp);
    }

    @Override
    public Employee fetchByEmployeeId(int empId) throws EmployeeNotFoundException {
        Employee emp = employeeRepo.findByEmpId(empId);
        if(emp!=null){
            return emp;
        } else{
            throw new EmployeeNotFoundException("Employee not found with employee ID: "+empId);
        }
    }

}
