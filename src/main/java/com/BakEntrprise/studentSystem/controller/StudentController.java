package com.BakEntrprise.studentSystem.controller;

import com.BakEntrprise.studentSystem.model.Student;
import com.BakEntrprise.studentSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//we inject student here
@RequestMapping("/student")

public class StudentController {
    @Autowired
    private StudentService studentService;
    //write the cod to save our database
    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New student is added";
    }
}
