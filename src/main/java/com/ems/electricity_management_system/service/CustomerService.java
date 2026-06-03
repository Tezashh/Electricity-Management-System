package com.ems.electricity_management_system.service;

import com.ems.electricity_management_system.entity.Customer;
import com.ems.electricity_management_system.exception.CustomerNotFoundException;
import com.ems.electricity_management_system.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
   @Autowired
   private CustomerRepository repository;
  public Customer saveCustomer(Customer customer){
      return repository.save(customer);
  }
  public String logic(String email,String password){
      Customer customer=repository.findByEmail(email);
      if(customer==null){
         throw new CustomerNotFoundException("User is not present.");
      }
      if(customer.getPassword().equals(password)){
          return "Login Successfull";
      }
      return "Invalid Password";

  }
}
