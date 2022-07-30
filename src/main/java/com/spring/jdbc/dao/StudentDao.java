package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entities.Student;

public interface StudentDao {
	public int insert(Student student);
	public int updateData(Student student);
	public int deleteData(Student student);
	public Student getStudent(int studentId);
	public List<Student> getAllStudents();

}
