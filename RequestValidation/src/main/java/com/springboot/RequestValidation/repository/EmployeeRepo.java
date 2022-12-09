package com.springboot.RequestValidation.repository;

import com.springboot.RequestValidation.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    Employee findByEmpId(int empId);
}
