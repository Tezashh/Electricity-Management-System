package com.ems.electricity_management_system.controller;

import com.ems.electricity_management_system.entity.Complaint;
import com.ems.electricity_management_system.service.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/complaint")
public class ComplaintController {
   @Autowired
    private ComplaintService service;

   @PostMapping("/register")
    public Complaint registerComplaint(@RequestBody Complaint complaint){
      return service.registerComplaint(complaint);
   }
   @GetMapping("/all")
       public List<Complaint> getAllCompalints(){
           return service.getAllComplaints();
       }
   @GetMapping("/customer/{customerId}")
    public List<Complaint> getComplaintByCustomerId(@PathVariable Long customerId){
       return service.getComplaintByCustsomerId(customerId);
   }
   @PutMapping("/resolve/{complaintId}")
    public Complaint resolveComplaint(@PathVariable Long complaintId){
    return service.resolveComplaint(complaintId);
   }

}
