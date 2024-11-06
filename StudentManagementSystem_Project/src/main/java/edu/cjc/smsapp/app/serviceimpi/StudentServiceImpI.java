package edu.cjc.smsapp.app.serviceimpi;

import java.util.List;
import java.util.Optional;

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

	@Override
	public List<Student> getBatchNo(String batchno) {
		
		return sr.findAllByBatchNumber(batchno);
	}

	@Override
	public Student loginCheck(String username, String password) {
	
		return sr.findByStudentEmailAndStudentContact(username, password);
	}

	@Override
	public Student getSingleData(int id) {
	
		return sr.findById(id).get();
	}

	@Override
	public void updateStudentFees(int id, float ammount) {

	       Student s=sr.findById(id).get();
			
			s.setFeesPaid(s.getFeesPaid()+ammount);
			
			sr.save(s);
	}

	@Override
	public void updateStudentBatch(int id, String batchNumber) {
		
		Optional<Student> op=sr.findById(id);
		if(op.isPresent())
		{
			Student s=op.get();
			s.setBatchMode(batchNumber);
			sr.save(s);
		}
		
	}

	@Override
	public void removeStudent(int id) {
		
		sr.deleteById(id);
		
	}	

	


}
