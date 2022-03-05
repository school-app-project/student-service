package com.jescandagire.studentapp.studentservice.controller;

import com.jescandagire.studentapp.studentservice.entity.StudentEntity;
import com.jescandagire.studentapp.studentservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student-app/api/v1/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/create-student")
    public StudentEntity saveStudent(@RequestBody StudentEntity student){
        return studentService.saveStudent(student);
    }

    @GetMapping("/get-all-students")
    public List<StudentEntity> getAllStudents(){
        return studentService.findAllStudents();
    }

    @GetMapping("/get-student-by-id/{studentId}")
    public Optional<StudentEntity> getStudentById(@PathVariable("studentId") int studentId){
        return studentService.findStudentById(studentId);
    }

    @PutMapping("/fully-edit-student/{studentId}")
    public StudentEntity fullUpdateStudent(@RequestBody StudentEntity student){
        return studentService.fullyUpdateStudent(student);
    }

    @DeleteMapping("/delete-student/{studentId}")
    public void deleteStudent(@PathVariable("studentId") int studentId){
        studentService.deleteStudentById(studentId);
    }
}
