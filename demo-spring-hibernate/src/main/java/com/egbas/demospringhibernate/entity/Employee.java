package com.egbas.demospringhibernate.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "emp_tbl")

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
   private String firstName;
   private String lastName;
   private String email;

   @ManyToOne
   @JoinColumn(name = "department_id")
   private Department department;

}
