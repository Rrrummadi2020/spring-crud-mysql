package com.rrrukgpalle.springcrudExample.service.impl;

import com.rrrukgpalle.springcrudExample.entity.Student;
import com.rrrukgpalle.springcrudExample.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> saveStudents(List<Student> students) {
        return studentRepository.saveAll(students);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public List<Student> getStudentsByName(String name) {
        return studentRepository.findByName(name);
    }

    public String deleteById(Long id) {
        studentRepository.deleteById(id);
        return "Student Got deleted ";
    }

    public Student updateStudent(Student student ){
        return studentRepository.save(student);
    }
}
