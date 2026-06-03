package com.ems.electricity_management_system.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String,String> handleValidation(MethodArgumentNotValidException ex){
        Map<String,String> errors=new HashMap<>();
        ex.getBindingResult()
                .getFieldErrors()
                .forEach(error->errors.put(error.getField(),error.getDefaultMessage()));
        return errors;

    }
    @ExceptionHandler(
            CustomerNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleCustomerNotFound(
            CustomerNotFoundException ex) {

        return ex.getMessage();
    }
    @ExceptionHandler(
            BillNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleBillNotFound(
            BillNotFoundException ex) {

        return ex.getMessage();
    }
    @ExceptionHandler(
            ComplaintNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleComplaintNotFound(
            ComplaintNotFoundException ex) {

        return ex.getMessage();
    }
}




