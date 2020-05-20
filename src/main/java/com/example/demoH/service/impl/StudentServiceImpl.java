package com.example.demoH.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoH.mapper.StudentMapper;
import com.example.demoH.model.Student;
import com.example.demoH.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentMapper studentMapper;

	@Override
	public List<Student> getAllStudent() {
		List<Student> allStudent = studentMapper.getAllStudent();
		return allStudent;
	}

	@Override
	public void createStudent(Student student) {
		studentMapper.createStudent(student);
		
	}

	@Override
	public void updateStudent(Student student) {
		studentMapper.updateStudent(student);
		
	}

}
