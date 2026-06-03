package com.ems.electricity_management_system.exception;

public class BillNotFoundException extends RuntimeException {
    public BillNotFoundException(String message){
        super(message);
    }
}
