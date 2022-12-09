package com.springboot.RequestValidation.entities;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue
    @Column(name = "employee_serial")
    private int employeeSerial;
    @Column(name = "emp_id")
    private int empId;
    @Column(name = "emp_name")
    private String empName;
    @Column(name = "emp_email")
    private String empEmail;
    @Column(name = "emp_phone_number")
    private String empPhoneNumber;
    @Column(name = "emp_age")
    private int empAge;
    @Column(name = "emp_gender")
    private String empGender;

    public Employee(int employeeSerial, int empId, String empName, String empEmail, String empPhoneNumber,
                    int empAge, String empGender) {
        this.employeeSerial = employeeSerial;
        this.empId = empId;
        this.empName = empName;
        this.empEmail = empEmail;
        this.empPhoneNumber = empPhoneNumber;
        this.empAge = empAge;
        this.empGender = empGender;
    }

    public Employee() {
    }

    public int getEmployeeSerial() {
        return employeeSerial;
    }

    public void setEmployeeSerial(int employeeSerial) {
        this.employeeSerial = employeeSerial;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpPhoneNumber() {
        return empPhoneNumber;
    }

    public void setEmpPhoneNumber(String empPhoneNumber) {
        this.empPhoneNumber = empPhoneNumber;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public String getEmpGender() {
        return empGender;
    }

    public void setEmpGender(String empGender) {
        this.empGender = empGender;
    }
}
