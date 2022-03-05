package com.jescandagire.studentapp.studentservice.repository;

import com.jescandagire.studentapp.studentservice.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
}
