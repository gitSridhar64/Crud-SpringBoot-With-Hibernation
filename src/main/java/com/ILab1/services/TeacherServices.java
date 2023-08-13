package com.ILab1.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ILab1.entity.Teacher;

@Service
public interface TeacherServices {
	public String addTeacheradata(Teacher t);
	public Teacher getTeacher(int t);
	public boolean checkTeacher(int TeacherId);
	public List<Teacher> getAllTeacher();


}
