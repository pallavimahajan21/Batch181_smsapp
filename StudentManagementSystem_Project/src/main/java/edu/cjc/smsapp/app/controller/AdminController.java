package edu.cjc.smsapp.app.controller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.cjc.smsapp.app.model.Student;
import edu.cjc.smsapp.app.service.StudentService;

@Controller
public class AdminController {
	int a;
	@Autowired
	StudentService ss;

	@RequestMapping("/")
	public String prelogin()
	{
		return "login";
	}
	

	@RequestMapping("/login")
	public String preReg(@RequestParam("username") String username,@RequestParam("password") String password,Model m)
	{
		if("admin".equalsIgnoreCase(username)&& "admin".equalsIgnoreCase(password))
		{
			List<Student> list=ss.getData();
			m.addAttribute("data", list);
			return "adminscreen";
		}
		else
		{
			Student s=ss.loginCheck(username,password);
			if(s!=null)
			{
				m.addAttribute("s", s);
				return "studentscreen";
			}
			else
			{
			m.addAttribute("message","Enter valid login details");
			return "login";
			}
		}
		
	}
	
	@RequestMapping("/enroll_student")
	public String login(@ModelAttribute Student s)
	{
		ss.saveData(s);
		return "adminscreen";
	}
	
	@RequestMapping("/search")
	public String getBatch(@RequestParam("batchNumber") String batchno, Model m)
	{
		List<Student> list=ss.getBatchNo(batchno);
	
		if(list.size()>0)
		{
			m.addAttribute("data", list);
		}
		else
		{
			List<Student> stu=ss.getData();
			m.addAttribute("data", stu);
			m.addAttribute("message", "No records are available for the batch "+batchno);
		}
		return "adminscreen";
	}
	
	@RequestMapping("/fees")
	public String edit(@RequestParam("id") int id, Model m)
	{
		Student s=ss.getSingleData(id);
		m.addAttribute("st", s);
		
		return "fees";
	}
	
	@RequestMapping("/payfees")
	public String payFees(@RequestParam("studentid") int id, @RequestParam("ammount") float ammount, Model m)
	{
		ss.updateStudentFees(id,ammount);
		List<Student> student=ss.getData();
		m.addAttribute("data", student);
		return "adminscreen";
	}
	
	@RequestMapping("/batch")
	public String batch(@RequestParam("id") int id, Model m)
	{
		Student s=ss.getSingleData(id);
		m.addAttribute("s", s);
		return "batch";
	}
	
	@RequestMapping("/updateBatch")
	public String batchShift(@RequestParam("studentid") int id, @RequestParam("batchNumber") String batchNumber, Model m)
	{
		ss.updateStudentBatch(id,batchNumber);
		List<Student> student=ss.getData();
		m.addAttribute("data", student);
		return "adminscreen";
	}
	
	@RequestMapping("/remove")
	public String removeStudent(@RequestParam("id") int id,Model m) {
		 
		ss.removeStudent(id);
		
		List<Student> list=ss.getData();
		m.addAttribute("data",list);
		return "adminscreen";
	}

	
}
