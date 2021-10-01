package com.project.project1;

import com.project.project1.Entity.Student;
import com.project.project1.Repository.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	studentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student s1 = new Student("Zeke","Yeager","zeke@gmail.com");
//		studentRepository.save(s1);
	}
}
