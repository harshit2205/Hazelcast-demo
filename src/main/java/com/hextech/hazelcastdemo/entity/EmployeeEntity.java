package com.hextech.hazelcastdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Employee")
public class EmployeeEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    protected int id;
    protected String name;
    protected String department;


}
