package com.ILab1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	@Id
	int StudentId;
	String StudentName;
	String SEmail;
	@OneToOne
	Teacher teacher;
	@OneToOne
	Marks marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String studentName, String sEmail, Teacher teacher, Marks marks) {
		super();
		StudentId = studentId;
		StudentName = studentName;
		SEmail = sEmail;
		this.teacher = teacher;
		this.marks = marks;
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getSEmail() {
		return SEmail;
	}
	public void setSEmail(String sEmail) {
		SEmail = sEmail;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Marks getMarks() {
		return marks;
	}
	public void setMarks(Marks marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", SEmail=" + SEmail + ", teacher="
				+ teacher + ", marks=" + marks + "]";
	}
	
	

}
