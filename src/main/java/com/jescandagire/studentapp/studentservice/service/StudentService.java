package com.jescandagire.studentapp.studentservice.service;

import com.jescandagire.studentapp.studentservice.entity.StudentEntity;
import com.jescandagire.studentapp.studentservice.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public StudentEntity saveStudent(StudentEntity student){
        log.info("Inside saveStudent method of student service");
        return studentRepository.save(student);
    }

    public Optional<StudentEntity> findStudentById(int studentId){
        log.info("Inside findStudentById method of student service");
        return studentRepository.findById(studentId);
    }

    public List<StudentEntity> findAllStudents(){
        log.info("Inside findAllStudents method of student service");
        return studentRepository.findAll();
    }

    public StudentEntity fullyUpdateStudent(StudentEntity student){
        if(student.getStudentId() != 0){
            studentRepository.save(student);
        }
        return student;
    }

    public void deleteStudentById(int studentId){
        log.info("Inside deleteStudentById method of student service");
        studentRepository.deleteById(studentId);
    }
}
