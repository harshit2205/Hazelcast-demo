package com.hextech.hazelcastdemo.repository;

import com.hextech.hazelcastdemo.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends JpaRepository<EmployeeEntity, Integer> {
}
