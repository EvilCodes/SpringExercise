package com.black.transaction.program;

import java.util.List;

import javax.sql.DataSource;

public interface I_StuDao {
	
	void setDataSource(DataSource ds);
	
	
	void create(String name,Integer age,Integer marks,Integer year);
	
	
	List<StudentMarks> listStudents();
	 
	
	void init();
	
	

}
