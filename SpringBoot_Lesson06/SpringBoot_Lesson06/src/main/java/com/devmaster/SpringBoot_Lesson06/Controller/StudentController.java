package com.devmaster.SpringBoot_Lesson06.Controller;

import org.hibernate.boot.model.naming.IllegalIdentifierException;
import org.springframework.ui.Model;
import com.devmaster.SpringBoot_Lesson06.DTO.StudentDTO;
import com.devmaster.SpringBoot_Lesson06.Entity.Student;
import com.devmaster.SpringBoot_Lesson06.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
// @RestController ---- Dùng API
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

  /*
  // Get All ------ API
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.findAll();
    }
  */

    @GetMapping
    public String getAllStudents(Model model) {
        List<Student> students = studentService.findAll();
        model.addAttribute("students",students);
        return "students/list";
    }
    //Get: Create
    @GetMapping("/add-new")
    public String addNewStudent(Model model) {
        model.addAttribute("student",new StudentDTO());
        return "students/create";
    }


    //Create Post
    @PostMapping("/add-new")
    public String saveNewStudent(@ModelAttribute("student") StudentDTO student) {
        studentService.save(student);
        return "redirect:/students";
    }

    //View
    @GetMapping("/view/{id}")
    public String viewStudent(@PathVariable(value="id") Long id, Model model) {
        StudentDTO studentDTO = studentService.findById(id).orElseThrow(()-> new
                IllegalIdentifierException("Invalid student id"+id));
        model.addAttribute("student",studentDTO);
        return "students/view";
    }


}
