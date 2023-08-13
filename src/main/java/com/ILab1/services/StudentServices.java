package com.ILab1.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ILab1.entity.Student;

@Service
public interface StudentServices {
	public String addStudent(Student st);
	public Student getStudent(int stid);
	public List<Student> getMyData(int stid);

}
