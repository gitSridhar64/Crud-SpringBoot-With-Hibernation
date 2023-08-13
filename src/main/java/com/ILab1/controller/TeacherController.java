package com.ILab1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ILab1.entity.Teacher;
import com.ILab1.services.TeacherServices;

@Controller
public class TeacherController {
	
	@Autowired
	TeacherServices teacherSer;
	
	@PostMapping("/addTeacher")
	public String addTeacher(@RequestParam ("teacherId") int teacherId,
			@RequestParam ("teacherName") String teacherName,
			@RequestParam ("tEmail") String tEmail) {
	try {
		
		Teacher teacher=new Teacher(teacherId, teacherName, tEmail);
		teacherSer.addTeacheradata(teacher);
		return "Sucessfull";
	}catch(Exception er)
	{
		return "Error";
	}
	}
	@GetMapping("/showTeacher")
	public String showTeacher(Model model)
	{
		try {
		List<Teacher> teacher=teacherSer.getAllTeacher();
		model.addAttribute("TeacherList", teacher);
		return "ShowTeacher";
		}catch(Exception er)
		{
			return "Error";
		}
	}
	
	

}
