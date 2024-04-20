package com.egbas.demospringhibernate.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "department_tbl")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Employee>employee;
}
