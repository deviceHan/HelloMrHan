package com.example.demoH.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoH.model.Student;
import com.example.demoH.service.StudentService;

@RestController
@RequestMapping(value="/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping(value="/all")
	public Object getAllStudent() {
		List<Student> allStudent = studentService.getAllStudent();
		return allStudent;
	}
	
	@PostMapping
	public Object createStudent(@RequestBody Student student) {
		studentService.createStudent(student);
		return "success";
	}
	
	@PostMapping(value="/update")
	public Object updateStudent(@RequestBody Student student) {
		studentService.updateStudent(student);
		return "success";
	}

}
