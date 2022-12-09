package com.springboot.RequestValidation.annotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class EmployeeGenderValidator implements ConstraintValidator<EmployeeGender, String> {

    @Override
    public boolean isValid(String empGender, ConstraintValidatorContext context) {
        List<String> genderList = Arrays.asList("male","female");
        return genderList.contains(empGender.toLowerCase());
    }

}
