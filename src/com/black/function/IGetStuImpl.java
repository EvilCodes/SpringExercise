package com.black.function;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

public class IGetStuImpl implements IGetStuMsg{
	private DataSource dataSource;
	private SimpleJdbcCall simpleCall;
	public void setDataSource(DataSource dataSource){
		this.dataSource=dataSource;
		this.simpleCall=new SimpleJdbcCall(dataSource)
							.withProcedureName("getRecord");
	}
	@Override
	public Student getStu(int id) {
		SqlParameterSource in=new MapSqlParameterSource().addValue("in_id", id);
		Map<String, Object> out = simpleCall.execute(in);
		Student student=new Student();
		student.setId(id);
		student.setName((String) out.get("out_name"));
		student.setAge((Integer) out.get("out_age"));
		return student;
	}

	@Override
	public void create(String name, Integer age) {
	}
	

}
