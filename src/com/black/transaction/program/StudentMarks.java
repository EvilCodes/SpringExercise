package com.black.transaction.program;

public class StudentMarks {
	private Integer id;
	private String name;
	private Integer age;
	private String gendar;
	private String hobbys;
	private Integer marks;
	private Integer year;
	private Integer sid;
	
	
	
	public StudentMarks() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGendar() {
		return gendar;
	}
	public void setGendar(String gendar) {
		this.gendar = gendar;
	}
	public String getHobbys() {
		return hobbys;
	}
	public void setHobbys(String hobbys) {
		this.hobbys = hobbys;
	}
	
	
	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	@Override
	public String toString() {
		return "StudentMapper [id=" + id + ", name=" + name + ", age=" + age + ", gendar=" + gendar + ", hobbys="
				+ hobbys + ", marks=" + marks + ", year=" + year + ", sid=" + sid + "]";
	}

	
	
	

}
