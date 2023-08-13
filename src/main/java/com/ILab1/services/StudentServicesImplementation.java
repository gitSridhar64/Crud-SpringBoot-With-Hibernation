package com.ILab1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ILab1.Repository.StudentRepository;
import com.ILab1.entity.Student;

@Service
public class StudentServicesImplementation implements StudentServices{
	
	@Autowired
	StudentRepository studRepo;

	@Override
	public String addStudent(Student st) {
		studRepo.save(st);
		return "added";
	}

	@Override
	public Student getStudent(int stid) {
		return studRepo.findById(stid).get();
	}

	@Override
	public List<Student> getMyData(int stid) {
		return  studRepo.getById(stid);
	}

}
