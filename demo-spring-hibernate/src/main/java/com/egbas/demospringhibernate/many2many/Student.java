package com.egbas.demospringhibernate.many2many;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="student_tbl")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany
    @JoinTable(name = "student_courses",
    joinColumns = @JoinColumn(name = "student_id"),
    inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private Set<Course> courses;
}
