package com.ILab1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ILab1.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer>{
	boolean existsById(int TeacherId);
}
