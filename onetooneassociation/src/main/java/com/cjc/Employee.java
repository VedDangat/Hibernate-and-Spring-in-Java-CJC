package com.cjc;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    private int eid;

    private String ename;
    private double esalary;

    @ManyToOne
    @JoinColumn(name = "did")
    private Department department;

    public Employee() {
    }

    public Employee(int eid, String ename, double esalary,
                    Department department) {
        this.eid = eid;
        this.ename = ename;
        this.esalary = esalary;
        this.department = department;
    }
}