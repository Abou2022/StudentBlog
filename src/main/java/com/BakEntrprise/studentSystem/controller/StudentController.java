package com.BakEntrprise.studentSystem.controller;

import com.BakEntrprise.studentSystem.model.Student;
import com.BakEntrprise.studentSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//we inject student here
@RequestMapping("/student")

public class StudentController {
    @Autowired
    private StudentService studentService;

    //write the cod to save our database
    @PostMapping("/add")
    public String add(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "New student is added";
    }
@GetMapping("/getAll")
    public List<Student> getAllStudent(){
        return studentService.getAllStudents();
}



}