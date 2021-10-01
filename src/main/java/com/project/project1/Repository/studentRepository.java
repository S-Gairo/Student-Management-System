package com.project.project1.Repository;

import com.project.project1.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface studentRepository extends JpaRepository<Student,Long> {

}
