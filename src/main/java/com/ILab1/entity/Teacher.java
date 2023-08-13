package com.ILab1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Teacher {
	@Id
	int TeacherId;
	String TeacherName;
	String tEmail;
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(int teacherId, String teacherName, String tEmail) {
		super();
		TeacherId = teacherId;
		TeacherName = teacherName;
		this.tEmail = tEmail;
	}
	public int getTeacherId() {
		return TeacherId;
	}
	public void setTeacherId(int teacherId) {
		TeacherId = teacherId;
	}
	public String getTeacherName() {
		return TeacherName;
	}
	public void setTeacherName(String teacherName) {
		TeacherName = teacherName;
	}
	public String gettEmail() {
		return tEmail;
	}
	public void settEmail(String tEmail) {
		this.tEmail = tEmail;
	}
	@Override
	public String toString() {
		return "Teacher [TeacherId=" + TeacherId + ", TeacherName=" + TeacherName + ", tEmail=" + tEmail + "]";
	}
	

}
