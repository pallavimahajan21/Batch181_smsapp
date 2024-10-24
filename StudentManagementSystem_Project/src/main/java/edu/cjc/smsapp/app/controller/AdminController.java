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
	
	@Autowired
	StudentService ss;

	@RequestMapping("/")
	public String prelogin()
	{
		return "login";
	}
	

	@RequestMapping("/login")
	public String preReg(@RequestParam("username") String us,@RequestParam("password") String pw,Model m)
	{
		if("admin".equalsIgnoreCase(us)&& "admin".equalsIgnoreCase(pw))
		{
			List<Student> list=ss.getData();
			m.addAttribute("data", list);
			return "adminscreen";
		}
		else
		{
			return "login";
			/*Student s=ss.loginCheck(us,pw);
			if(s!=null)
			{
				m.addAttribute("details", s);
				return "studentscreen";
			}
			else
			{
			m.addAttribute("message","invalid condiale");
			return "login";
			}*/
		}
		
	}
	
	@RequestMapping("/enroll_student")
	public String login(@ModelAttribute Student s)
	{
		ss.saveData(s);
		return "adminscreen";
	}
	
	/*@RequestMapping("/edit")
	public String editData(@RequestParam("studentContact") String contact)
	{
		Student s=ss.editData(contact);
		return "adminscreen";
		
	}*/
	
	
}
