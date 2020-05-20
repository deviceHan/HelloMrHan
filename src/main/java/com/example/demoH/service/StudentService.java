package com.example.demoH.service;

import java.util.List;

import com.example.demoH.model.Student;

public interface StudentService {
	List<Student> getAllStudent();
	
	void createStudent(Student student);
	
	void updateStudent(Student student);
}
