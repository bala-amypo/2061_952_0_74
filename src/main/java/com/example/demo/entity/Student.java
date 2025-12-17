package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistance.E
@Entity
public class Student {
    private Long id;
    private String name;
    private String dept;
    private LocalDate dob;
    private float cgpa;

    
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDept() {
        return dept;
    }
    public LocalDate getDob() {
        return dob;
    }
    public float getCgpa() {
        return cgpa;
    }
    
}