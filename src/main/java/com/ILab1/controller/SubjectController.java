package com.ILab1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ILab1.entity.Subject;
import com.ILab1.entity.Teacher;
import com.ILab1.services.SubjectServices;
import com.ILab1.services.TeacherServices;

@Controller
public class SubjectController {
	@Autowired
	SubjectServices subSer;
	
	@Autowired
	TeacherServices teachSer;
	
	@PostMapping("/addSubject")
	public String addSubject(@RequestParam ("subjectId") int subjectId,
			@RequestParam ("subjectName") String subjectName,
			@RequestParam ("teacherId") int teacherId)
	{
		try {
		Teacher t=teachSer.getTeacher(teacherId);
		Subject sub=new Subject();
		sub.setSubjectId(subjectId);
		sub.setSubjectName(subjectName);
		sub.setTeacher(t);
		subSer.addSubjectdata(sub);
		return "Sucessfull";
	}catch(Exception er)
	{
		return "Error";
	}
		
	}
	@GetMapping("/showSubject")
	public String showSubject(Model model)
	{
		try {
		List<Subject> subject=subSer.getAllSubject();
		model.addAttribute("SubjectList", subject);
		return "ShowSubject";
		}catch(Exception er)
		{
			return "Error";
		}
	}

}

