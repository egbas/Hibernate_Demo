package com.egbas.demospringhibernate.many2many;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "course_tbl")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @ManyToMany(mappedBy = "courses")
    private Set<Student> students;
}
