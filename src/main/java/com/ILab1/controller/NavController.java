package com.ILab1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {
	
	@GetMapping("/AddTeacher")
	public String AddTeacher()
	{
		return "AddTeacher";
		
	}
	@GetMapping("/AddSubject")
	public String AddSubject()
	{
		return "AddSubject";
		
	}
	@GetMapping("/AddStudent")
	public String AddStudent()
	{
		return "AddStudent";
		
	}
	@GetMapping("/AddMarks")
	public String AddMarks()
	{
		return "AddMarks";
		
	}
	@GetMapping("/ShowData")
	public String ShowData()
	{
		return "ShowData";
		
	}
	@GetMapping("/ShowMarks")
	public String ShowMarks()
	{
		return "ShowMarks";
		
	}
	@GetMapping("/ShowTeacher")
	public String ShowTeacher()
	{
		return "ShowTeacher";
		
	}
	
	@GetMapping("/ShowSubject")
	public String ShowSubject()
	{
		return "ShowSubject";
		
	}
	@GetMapping("/UpdateMarks")
	public String UpdateMarks()
	{
		return "UpdateMarks";
		
	}
	@GetMapping("/DeleteId")
	public String DeleteId()
	{
		return "DeleteId";
		
	}
	@GetMapping("/Sucessfull")
	public String Sucessfull()
	{
		return "Sucessfull";
		
	}
	
}

