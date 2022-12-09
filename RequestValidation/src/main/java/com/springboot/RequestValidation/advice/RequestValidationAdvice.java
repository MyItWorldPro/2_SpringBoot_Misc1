package com.springboot.RequestValidation.advice;

import com.springboot.RequestValidation.exception.EmployeeNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class RequestValidationAdvice {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleInvalidRequest(MethodArgumentNotValidException ex) {
        Map<String, String> invalidFieldMap = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(fieldError -> {
            invalidFieldMap.put(fieldError.getField(), fieldError.getDefaultMessage());
        });
        return invalidFieldMap;
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(EmployeeNotFoundException.class)
    public Map<String, String> handleEmpNotFoundException(EmployeeNotFoundException ex) {
        Map<String, String> empErrorMap = new HashMap<>();
        empErrorMap.put("errorMessage", ex.getMessage());
        return empErrorMap;
    }

}
