package com.springboot.RequestValidation.dto;

import com.springboot.RequestValidation.annotations.EmployeeGender;

import javax.validation.constraints.*;

public class EmployeeDto {

    @NotNull(message = "Employee ID cannot be null.")
    private int empId;
    @NotBlank(message = "Employee Name cannot be blank.")
    private String empName;
    @Email(message = "Email is not valid.")
    private String empEmail;
    @NotNull(message = "Employee Phone Number cannot be null.")
    @Pattern(regexp = "^\\d{10}$", message = "Phone number must be a 10 digit number.")
    private String empPhoneNumber;
    @Min(value = 18, message = "Employee Age must be greater than 18.")
    @Max(value = 60, message = "Employee Age must be less than 60.")
    private int empAge;
    @EmployeeGender
    private String empGender;

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
