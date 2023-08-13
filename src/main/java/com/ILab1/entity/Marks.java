package com.ILab1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Marks {
	@Id
	int MarksId;
	@OneToOne
	Subject subject;
	float Marks;
	public Marks() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Marks(int marksId, Subject subject, float marks) {
		super();
		MarksId = marksId;
		this.subject = subject;
		Marks = marks;
	}
	
	public int getMarksId() {
		return MarksId;
	}
	public void setMarksId(int marksId) {
		MarksId = marksId;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public float getMarks() {
		return Marks;
	}
	public void setMarks(float marks) {
		Marks = marks;
	}
	@Override
	public String toString() {
		return "Marks [MarksId=" + MarksId + ", subject=" + subject + ", Marks=" + Marks + "]";
	}
	

}
