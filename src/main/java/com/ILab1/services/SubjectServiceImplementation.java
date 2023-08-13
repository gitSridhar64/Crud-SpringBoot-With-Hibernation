package com.ILab1.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ILab1.Repository.SubjectRepository;
import com.ILab1.entity.Subject;

@Service
public class SubjectServiceImplementation implements SubjectServices{
@Autowired
SubjectRepository subRepo;
	
	@Override
	public String addSubjectdata(Subject s) {
		subRepo.save(s);
		return "added";
	}

	@Override
	public Subject getSubject(int subid) {
		return subRepo.findById(subid).get();
	}

	@Override
	public List<Subject> getAllSubject() {
		return subRepo.findAll();
	}

}
