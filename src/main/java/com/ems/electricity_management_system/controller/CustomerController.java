package com.ems.electricity_management_system.controller;

import com.ems.electricity_management_system.dto.LoginRequest;
import com.ems.electricity_management_system.entity.Customer;
import com.ems.electricity_management_system.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService service;
    @PostMapping("/register")
    public Customer register(@Valid @RequestBody Customer customer){
        return service.saveCustomer(customer);
    }
    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request){
        return service.logic(request.getEmail(), request.getPassword());
    }

}
