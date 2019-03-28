package com.student.service;

import com.student.model.StudentModel;


public interface StudentService {

	public StudentModel getById(int id);
	
	public  StudentModel getByName(String name);
}
