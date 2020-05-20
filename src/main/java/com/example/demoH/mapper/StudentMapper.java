package com.example.demoH.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demoH.model.Student;

@Mapper
public interface StudentMapper {
	List<Student> getAllStudent();
	
	void createStudent(Student student);
	
	void updateStudent(Student student);
}
