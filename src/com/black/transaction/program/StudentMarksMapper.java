package com.black.transaction.program;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMarksMapper implements RowMapper<StudentMarks> {

	@Override
	public StudentMarks mapRow(ResultSet rs, int rowNum) throws SQLException {
		StudentMarks marks=new StudentMarks();
		marks.setId(rs.getInt("id"));
		marks.setAge(rs.getInt("age"));
		marks.setGendar(rs.getString("gendar"));
		marks.setHobbys(rs.getString("hobbys"));
		marks.setYear(rs.getInt("year"));
		marks.setSid(rs.getInt("sid"));
		marks.setName(rs.getString("name"));
		marks.setMarks(rs.getInt("marks"));
		return marks;
	}

}
