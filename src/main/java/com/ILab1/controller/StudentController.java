package com.ILab1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ILab1.entity.Student;
import com.ILab1.entity.Teacher;
import com.ILab1.entity.Marks;
import com.ILab1.services.MarksServices;
import com.ILab1.services.StudentServices;
import com.ILab1.services.SubjectServices;
import com.ILab1.services.TeacherServices;

@Controller
public class StudentController {
	
	@Autowired
	SubjectServices subSer;
	
	@Autowired
	TeacherServices teachSer;
	
	@Autowired
	StudentServices studSer;
	@Autowired
	MarksServices markSer;
	
	@PostMapping("/addStudent")
	public String addStudent(@RequestParam ("studentId") int studentId,
			@RequestParam ("StudentName") String StudentName,
			@RequestParam ("stEmail") String stEmail,
			@RequestParam ("teacherId") int teacherId,
			@RequestParam ("markId") int markId)
	{
		try {
		Teacher tt=teachSer.getTeacher(teacherId);
		Marks m=markSer.getMarks(markId);
		Student stud=new Student();
		stud.setStudentId(studentId);
		stud.setStudentName(StudentName);
		stud.setSEmail(stEmail);
		stud.setTeacher(tt);
		stud.setMarks(m);
		studSer.addStudent(stud);
		return "Sucessfull";
		}catch(Exception er)
		{
			return "Error";
		}
	}
	
	@PostMapping("/getStudentData")
	public String getStudentData(@RequestParam ("studentId") int studentId, Model model)
	{
		try {
		List<Student> mydata=studSer.getMyData(studentId);
		model.addAttribute("data", mydata);
		return "ShowData";
	}catch(Exception er)
	{
		return "Error";
	}
	}
	

}
