package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository stdrepo; //creating object
    @Override
    public Student poststudent(Student st){
        return stdrepo.save(st);  //positing(saving) student details
    }
}