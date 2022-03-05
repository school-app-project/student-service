package com.jescandagire.studentapp.studentservice.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentEntity {
    // having a sequence column for the student
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("student_id")
    @ApiModelProperty(notes = "this is the student id")
    @Column(name = "student_id", nullable = false)
    private int studentId;

    @JsonProperty("first_name")
    @ApiModelProperty(notes = "This is the student's first name", example = "Jesca")
    @Column(name = "first_name", nullable = false, length = 15)
    private String firstName;

    @JsonProperty("last_name")
    @ApiModelProperty(notes = "This is the student's last name", example = "Ndagire")
    @Column(name = "last_name", nullable = false, length = 25)
    private String lastName;

    @JsonProperty("email")
    @ApiModelProperty(notes = "This is the student's email address", example = "jesca@gmail.com")
    @Column(name = "email", unique = true, nullable = false, length = 100)
    private String email;

    @JsonProperty("age")
    @ApiModelProperty(notes = "This is the student's age", example = "12")
    @Column(name = "age", nullable = false, length = 25)
    private int age;
}
