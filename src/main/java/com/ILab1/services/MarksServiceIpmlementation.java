package com.ILab1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ILab1.Repository.MarksRepository;
import com.ILab1.entity.Marks;

@Service
public class MarksServiceIpmlementation implements MarksServices{
	@Autowired
	MarksRepository markRepo;

	@Override
	public String addMarksdata(Marks m) {
		markRepo.save(m);
		return null;
	}

	@Override
	public Marks getMarks(int markid) {
		return markRepo.findById(markid).get();
	}

	@Override
	public List<Marks> showAllMarks() {
		return markRepo.findAll();
	}

	@Override
	public boolean hasId(int id) {
		// TODO Auto-generated method stub
		return markRepo.existsById(id);
	}

	@Override
	public String deleteMarksdata(Marks m) {
		markRepo.delete(m);
		return null;
	}

}
