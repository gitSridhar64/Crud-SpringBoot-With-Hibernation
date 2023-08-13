package com.ILab1.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ILab1.entity.Marks;

@Service
public interface MarksServices {
	public String addMarksdata(Marks m);
	public Marks getMarks (int markid);
	public List<Marks> showAllMarks();
	public boolean hasId(int id);
	public String deleteMarksdata(Marks m);
}
