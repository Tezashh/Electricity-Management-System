package com.ems.electricity_management_system.controller;

import com.ems.electricity_management_system.entity.Bills;
import com.ems.electricity_management_system.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/bills")
public class BillController {
    @Autowired
    private BillService service;
    @PostMapping("/add")
    public Bills addBill(@RequestBody Bills bills){
        return service.addBill(bills);

    }
    @GetMapping("/all")
    public List<Bills> getAllBills(){
        return service.getAllBills();
    }
    @GetMapping("/customer/{customerId}")
    public List<Bills> getBillsByCustomerId(@PathVariable Long customerId){
        return service.getBillsByCustomerId(customerId);

    }
    @PutMapping("/pay/{billId}")
    public Bills payBill(@PathVariable Long billId){
        return service.payBill(billId);
    }

}
