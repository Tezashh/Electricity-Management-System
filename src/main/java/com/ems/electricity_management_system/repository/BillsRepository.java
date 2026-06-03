package com.ems.electricity_management_system.repository;

import com.ems.electricity_management_system.entity.Bills;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BillsRepository extends JpaRepository<Bills,Long> {
    List<Bills> findBycustomerId(Long customerId);
}
