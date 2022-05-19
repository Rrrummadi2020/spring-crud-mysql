package com.rrrukgpalle.springcrudExample.controller;

import com.rrrukgpalle.springcrudExample.entity.Student;
import com.rrrukgpalle.springcrudExample.service.impl.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class StudentController {

    @Autowired
    private StudentService studentservice;

    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student) {
        return studentservice.saveStudent(student);
    }

    @PostMapping("/students")
    public List<Student> addStudents(@RequestBody List<Student> students) {
        return studentservice.saveStudents(students);
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentservice.getAllStudents();
    }

    @PutMapping("/student")
    public Student updateStudent(@RequestBody Student student) {
        return studentservice.updateStudent(student);
    }

    @DeleteMapping("/student")
    public String deleteStudent(@RequestParam Long id) {
        return studentservice.deleteById(id);
    }
}
