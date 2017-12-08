package com.black.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StuHandleImpl implements IStuHandle{
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource){
		this.dataSource=dataSource;
		jdbcTemplate=new JdbcTemplate(dataSource);
		
	}
	@Override
	public Student getStudent(int id) {
		String sql="select * from t_stu where id=?";
		Student stu=jdbcTemplate.queryForObject(sql, new Object[]{id}, new StuMapper());
		return stu;
	}

	@Override
	public List<Student> getStudents() {
		
		String sql="select * from t_stu";
		List<Student>list=(List<Student>) jdbcTemplate.query(sql, new StuMapper());
		return list;
	}

	@Override
	public void deleteData(int id) {
		String sql="delete from t_stu where id=?";
		jdbcTemplate.update(sql, new Object[]{id});
		
	}

	@Override
	public void updateData(int id, String name) {
		String sql="update t_stu set name=? where id=?";
		jdbcTemplate.update(sql, new Object[]{name,id});
		
	}

	@Override
	public void insertData(Student stu) {
		String sql="insert into t_stu (id,name,age,gendar,hobbys) values(?,?,?,?,?)";
		jdbcTemplate.update(sql,new Object[]{stu.getId(),stu.getName(),stu.getAge(),stu.getGendar(),stu.getHobbys()});
		
	}
	


}
