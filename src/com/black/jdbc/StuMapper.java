package com.black.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StuMapper implements RowMapper<Student>{
	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student stu=new Student();
		stu.setName(rs.getString("name"));
		stu.setAge(rs.getInt("age"));
		stu.setGendar(rs.getString("gendar"));
		stu.setHobbys(rs.getString("hobbys"));
		stu.setId(rs.getInt("id"));
		return stu;
	}

}
