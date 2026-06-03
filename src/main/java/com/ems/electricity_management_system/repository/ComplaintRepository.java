package com.ems.electricity_management_system.repository;

import com.ems.electricity_management_system.entity.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComplaintRepository extends JpaRepository<Complaint,Long> {
    List<Complaint> findByCustomerId(Long customerId);
}
