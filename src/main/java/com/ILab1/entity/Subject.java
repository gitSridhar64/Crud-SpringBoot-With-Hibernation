package com.ILab1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;


@Entity
public class Subject {
	@Id
	int SubjectId;
	String SubjectName;
	@OneToOne
	Teacher teacher;
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subject(int subjectId, String subjectName, Teacher teacher) {
		super();
		SubjectId = subjectId;
		SubjectName = subjectName;
		this.teacher = teacher;
	}
	public int getSubjectId() {
		return SubjectId;
	}
	public void setSubjectId(int subjectId) {
		SubjectId = subjectId;
	}
	public String getSubjectName() {
		return SubjectName;
	}
	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return "Subject [SubjectId=" + SubjectId + ", SubjectName=" + SubjectName + ", teacher=" + teacher + "]";
	}
	

}
