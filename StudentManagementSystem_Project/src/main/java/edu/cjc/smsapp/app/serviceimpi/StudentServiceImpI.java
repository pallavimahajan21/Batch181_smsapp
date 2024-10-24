package edu.cjc.smsapp.app.serviceimpi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cjc.smsapp.app.model.Student;
import edu.cjc.smsapp.app.repository.StudentRepositary;
import edu.cjc.smsapp.app.service.StudentService;

@Service
public class StudentServiceImpI implements StudentService{

	@Autowired
	StudentRepositary sr;
	
	@Override
	public void saveData(Student s) {
	
		sr.save(s);
	}

	@Override
	public List<Student> getData() {
		
		return sr.findAll();
	}

	

	

	

	

}
