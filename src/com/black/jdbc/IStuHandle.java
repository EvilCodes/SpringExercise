package com.black.jdbc;

import java.util.List;

public interface IStuHandle {
	public Student getStudent(int id);
	public List<Student> getStudents();
	public void deleteData(int id);
	public void updateData(int id,String name);
	public void insertData(Student stu);
	
}
