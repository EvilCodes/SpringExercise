package com.black.required;

import org.springframework.beans.factory.annotation.Required;

public class StuMsg {
	
	private int age;
	private String name;
	private String gendar;
	private String hobbys;
	
	
	@Required
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	@Required
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	@Required
	public void setGendar(String gendar) {
		this.gendar = gendar;
	}
	public String getGendar() {
		return gendar;
	}
	
	
	@Required
	public void setHobbys(String hobbys) {
		this.hobbys = hobbys;
	}
	
	public String getHobbys() {
		return hobbys;
	}
	

}
