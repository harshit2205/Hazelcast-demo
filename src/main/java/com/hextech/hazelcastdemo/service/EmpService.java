package com.hextech.hazelcastdemo.service;

import com.hextech.hazelcastdemo.entity.EmployeeEntity;
import org.springframework.stereotype.Service;

@Service
public interface EmpService {

    public EmployeeEntity saveEmployee(EmployeeEntity entity);

    public EmployeeEntity get(Integer id);
}
