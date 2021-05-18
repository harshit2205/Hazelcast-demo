package com.hextech.hazelcastdemo.serviceImpl;

import com.hextech.hazelcastdemo.entity.EmployeeEntity;
import com.hextech.hazelcastdemo.repository.EmpRepo;
import com.hextech.hazelcastdemo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    EmpRepo repo;

    @Override
    public EmployeeEntity saveEmployee(EmployeeEntity entity) {
        return repo.save(entity);
    }

    @Override
    public EmployeeEntity get(Integer id) {
        Optional<EmployeeEntity> employee =  repo.findById(id);
        return employee.orElse(new EmployeeEntity(0,"no data","no department"));
    }
}
