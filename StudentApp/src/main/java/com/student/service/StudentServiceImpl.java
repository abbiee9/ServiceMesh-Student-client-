package com.student.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.config.SchoolFeignClient;
import com.student.model.StudentModel;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private SchoolFeignClient schoolFeignClient;
	
	
	List<StudentModel> modelList = new ArrayList<StudentModel>();
	
	StudentServiceImpl()
	{
	
		for(int i=0;i<3;i++)
		{
			StudentModel model = new StudentModel();
			model.setId(i);
			model.setName("CanaryName"+i);
			model.setSchoolName("Canaryhira"+i);
			model.setGender("CanaryMale");
			modelList.add(model);
		}
		
	}

	
	@Override
	public StudentModel getById(int id) {
		StudentModel newModel = new StudentModel();
		modelList.forEach(model->{
			
			if(model.getId()==id)
			{
				newModel.setGender(model.getGender());
				newModel.setId(id);
				newModel.setName(model.getName());
				newModel.setSchoolName(model.getSchoolName());
				newModel.setSchoolModel(schoolFeignClient.getStudentByschoolName(model.getSchoolName()).getBody());
			}
		});
		return newModel;
	}

	@Override
	public StudentModel getByName(String name) {
		StudentModel newModel = new StudentModel();
		modelList.forEach(model->{
			
			if(model.getName().equalsIgnoreCase(name))
			{
				newModel.setGender(model.getGender());
				newModel.setId(model.getId());
				newModel.setName(name);
				newModel.setSchoolName(model.getSchoolName());
				newModel.setSchoolModel(schoolFeignClient.getStudentByschoolName(model.getSchoolName()).getBody());
			}
		});
		return newModel;
	}

}
