package com.devmaster.Lesson03.Controller;

import com.devmaster.Lesson03.Entity.Student;
import com.devmaster.Lesson03.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class StudentController {

   @Autowired
    private StudentService studentService;

   @GetMapping("/students")
    public List<Student> getAllStudents(){
       return studentService.getStudents();
   }

   @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable String id){
       Long param = Long.parseLong(id);
       return studentService.getStudentById(param);
   }

   @PostMapping("/student-add")
    public Student addStudent(@RequestBody Student student){
       return studentService.addStudent(student);
   }

   @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable String id, @RequestBody Student student){
       Long param = Long.parseLong(id);
       return studentService.updateStudent(param, student);
   }

   @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable String id){
       Long param = Long.parseLong(id);
       studentService.deleteStudent(param);
   }
}
