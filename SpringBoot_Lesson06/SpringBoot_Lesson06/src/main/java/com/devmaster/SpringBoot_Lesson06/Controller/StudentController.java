package com.devmaster.SpringBoot_Lesson06.Controller;

import com.devmaster.SpringBoot_Lesson06.Entity.Student;
import com.devmaster.SpringBoot_Lesson06.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
//
    // Get All
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.findAll();
    }
}
