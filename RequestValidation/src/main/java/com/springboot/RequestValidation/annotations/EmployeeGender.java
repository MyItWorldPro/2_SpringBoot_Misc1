package com.springboot.RequestValidation.annotations;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = EmployeeGenderValidator.class)
public @interface EmployeeGender {

    public String message() default "Employee Gender must be either Male or Female.";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
