package com.ems.electricity_management_system.service;

import com.ems.electricity_management_system.entity.Complaint;
import com.ems.electricity_management_system.exception.ComplaintNotFoundException;
import com.ems.electricity_management_system.repository.ComplaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComplaintService {
    @Autowired
    private ComplaintRepository repository;
    public Complaint registerComplaint(Complaint complaint){
        complaint.setStatus("OPEN");
        return repository.save(complaint);
    }
    public List<Complaint> getAllComplaints(){
        return repository.findAll();
    }
    public  List<Complaint> getComplaintByCustsomerId(Long customerId){
        return repository.findByCustomerId(customerId);
    }
    public Complaint resolveComplaint(Long complaintId){
        Complaint complaint=repository.findById(complaintId).orElseThrow(()->new ComplaintNotFoundException("Complaint Not Found!!"));
       complaint.setStatus("RESOLVED");
       return repository.save(complaint);
    }

}
