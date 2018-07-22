package com.edureka.spring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDAO {
	

	private JdbcTemplate jdbcTemplate;
	
	public StudentDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void saveStudent(Student student) {
		String insertStmt = "insert into student (name,age) values('"+student.getName()+"','"+student.getAge()+"')";
		this.jdbcTemplate.execute(insertStmt);
	}
	
	public List<Student> listAll(){
		String listStmt = "select * from student";
		List<Student> studentsList = jdbcTemplate.queryForList(listStmt, Student.class);
		return studentsList;
	}
	
	public Student findOne(int studentId) {
		String findStmt = "select * from student where id='"+studentId+"'";
		Student returnStudent = (Student) jdbcTemplate.query(findStmt,(rs, rowNum)->{
			Student student = new Student();
			student.setId(rs.getInt(1));
			student.setName(rs.getString(2));
			student.setAge(rs.getInt(3));
			return student;
		});
		return returnStudent;
	}
	
	public void deleteStudent(int studentId) {
		String deleteStmt = "delete from student where id='"+studentId+"'";
		jdbcTemplate.execute(deleteStmt);
	}

}
