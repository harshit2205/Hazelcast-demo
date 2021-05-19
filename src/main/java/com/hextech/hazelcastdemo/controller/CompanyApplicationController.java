package com.hextech.hazelcastdemo.controller;

import com.hextech.hazelcastdemo.entity.EmployeeEntity;
import com.hextech.hazelcastdemo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/")
public class CompanyApplicationController {


    @Autowired
    EmpService empService;

    @Cacheable(value = "employee", key="#id")
    @GetMapping("employee/{id}")
    public EmployeeEntity getSubscriber(@PathVariable("id") int id) throws
            InterruptedException {
        System.out.println("Finding employee information with id " + id + " ...");
        Thread.sleep(5000);
        return empService.get(id);
    }

    @CachePut(value="employee", key="#emp.id")
    @PostMapping("employee/addnew")
    public EmployeeEntity post(@RequestBody EmployeeEntity emp){
        System.out.println("trying to push value to cache server : "+emp.getId());
        return empService.saveEmployee(emp);
    }

}
