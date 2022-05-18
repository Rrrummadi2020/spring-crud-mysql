package com.rrrukgpalle.springcrudExample.controller;

import com.rrrukgpalle.springcrudExample.entity.Student;
import com.rrrukgpalle.springcrudExample.service.impl.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentservice;

    @PostMapping("/api/student")
    public Student addStudent(@RequestBody Student student){
        return studentservice.saveStudent(student);
    }
    @PostMapping("/api/students")
    public List<Student> addStudents(@RequestBody List<Student> students){
        return  studentservice.saveStudents(students);
    }
    @GetMapping("/api/students")
    public List<Student> getAllStudents(){
        return studentservice.getAllStudents();
    }
}
