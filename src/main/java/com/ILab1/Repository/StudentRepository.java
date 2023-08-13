package com.ILab1.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ILab1.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	public List<Student> getById(int StudentId);

}
