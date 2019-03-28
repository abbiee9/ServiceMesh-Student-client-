package com.student.model;

import com.school.response.model.SchoolModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class StudentModel {

	private int id;
	private String name;
	private String gender;
	private String schoolName;
	private SchoolModel schoolModel;
	
	
	public SchoolModel getSchoolModel() {
		return schoolModel;
	}
	public void setSchoolModel(SchoolModel schoolModel) {
		this.schoolModel = schoolModel;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	
	
}
