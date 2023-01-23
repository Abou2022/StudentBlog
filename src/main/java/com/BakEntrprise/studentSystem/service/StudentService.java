package com.BakEntrprise.studentSystem.service;

import com.BakEntrprise.studentSystem.model.Student;

import java.util.List;

public interface StudentService {

    //To add student
    public Student saveStudent(Student student);

    //to get All Student
    public List<Student> getAllStudents();

    //TODO put or update data

    //TODO delete date
}
