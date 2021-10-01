package com.project.project1.Service;

import com.project.project1.Entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentByID(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}
