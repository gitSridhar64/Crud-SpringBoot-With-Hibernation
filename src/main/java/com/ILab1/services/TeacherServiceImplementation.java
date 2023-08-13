package com.ILab1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ILab1.Repository.TeacherRepository;
import com.ILab1.entity.Teacher;

@Service
public class TeacherServiceImplementation implements TeacherServices{

	@Autowired
	TeacherRepository tRepo;
	
	@Override
	public String addTeacheradata(Teacher t) {
		tRepo.save(t);
		return "added";
	}

	@Override
	public Teacher getTeacher(int t) {
		
		return tRepo.findById(t).get();
	}

	@Override
	public boolean checkTeacher(int TeacherId) {
		// TODO Auto-generated method stub
		return tRepo.existsById(TeacherId);
	}

	@Override
	public List<Teacher> getAllTeacher() {
		return tRepo.findAll();
	}

}
