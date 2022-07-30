package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {
	JdbcTemplate jdbcTemplate;

	public int insert(Student s) {
		
		String query = "insert into student(studentId,studentName, studentCity) values(?,?,?)";
		int result = this.jdbcTemplate.update(query,s.getStudentId(), s.getStudentName(),s.getStudentCity());
		return result;
	}
	
	public int updateData(Student s) {
		String query = "update student set studentName=?, studentCity=? where studentId=?";
		int result = this.jdbcTemplate.update(query,s.getStudentName(),s.getStudentCity(),s.getStudentId());
		return result;
	}
	
	public int deleteData(Student s) {
		String query = "delete from student where studentId=?";
		int result = this.jdbcTemplate.update(query,s.getStudentId());
		return result;
	}
	
	public Student getStudent(int studentId) {
		String query = "select * from student where studentId=?";
		RowMapper<Student> rowMapperImpl = new   RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query,rowMapperImpl,studentId);
		return student;
	}
	
	public List<Student> getAllStudents() {
		String query = "select * from student";
		RowMapper<Student> rowMapperImpl = new   RowMapperImpl();
		List<Student> student = this.jdbcTemplate.query(query,rowMapperImpl);
		return student;	
	}


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}






	
	
	
	

}
