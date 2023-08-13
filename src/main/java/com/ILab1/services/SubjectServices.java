package com.ILab1.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ILab1.entity.Subject;

@Service
public interface SubjectServices {
	public String addSubjectdata(Subject s);
	public Subject getSubject (int subid);
	public List<Subject> getAllSubject();
}
