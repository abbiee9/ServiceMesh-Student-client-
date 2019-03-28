package com.student.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RestController;

import com.student.model.StudentModel;
import com.student.resource.controller.IStudentResource;
import com.student.service.StudentService;

@RestController
public class StudentController implements IStudentResource {

	@Autowired
	private StudentService studentService;
	
	@Override
	public ResponseEntity<StudentModel> getById(int id) {
		 return ResponseEntity.ok(studentService.getById(id));
		
	}

	@Override
	public ResponseEntity<StudentModel> getByName(String name) {
		 return ResponseEntity.ok(studentService.getByName(name));
	}

}
