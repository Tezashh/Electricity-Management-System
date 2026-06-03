package com.ems.electricity_management_system.service;

import com.ems.electricity_management_system.entity.Bills;
import com.ems.electricity_management_system.exception.BillNotFoundException;
import com.ems.electricity_management_system.repository.BillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BillService {
    @Autowired
    private BillsRepository repository;
    public Bills addBill(Bills bills){
        return repository.save(bills);
    }
    public List<Bills> getAllBills(){
        return repository.findAll();

    }
    public List<Bills> getBillsByCustomerId(Long customerId){
        return repository.findBycustomerId(customerId);
    }
    public Bills payBill(Long billId){
        Bills bill=repository.findById(billId).orElseThrow(()->new BillNotFoundException("Bill Not Found!!"));
        bill.setStatus("Paid");
        return repository.save(bill);
    }
}
