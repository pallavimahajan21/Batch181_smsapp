package edu.cjc.smsapp.app.service;

import java.util.List;

import edu.cjc.smsapp.app.model.Student;

public interface StudentService {

	public void saveData(Student s);

	public List<Student> getData();

	public List<Student> getBatchNo(String batchno);

	public Student loginCheck(String username, String password);

	public Student getSingleData(int id);

	public void updateStudentFees(int id, float ammount);

	public void updateStudentBatch(int id, String batchNumber);

	public void removeStudent(int id);



	


	


}
