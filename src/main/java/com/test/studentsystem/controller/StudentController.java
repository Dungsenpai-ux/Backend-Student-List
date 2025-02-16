package com.test.studentsystem.controller;

import com.test.studentsystem.model.Student;
import com.test.studentsystem.service.StudentService;
import com.test.studentsystem.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "New Student added";
    }
    @GetMapping("/getAll")
    public List<Student> list(){
        return studentService.getAllStudents();
    }
}
