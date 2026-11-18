package com.cjc;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "department")
public class Department {

    @Id
    private int did;

    private String depname;

    public Department() {
    }

    public Department(int did, String depname) {
        this.did = did;
        this.depname = depname;
    }
}