package com.black.beanlifetime;

public class LifeBean {
	
	private String name;
	private String time;
	private int nums;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getNums() {
		return nums;
	}
	public void setNums(int nums) {
		this.nums = nums;
	}
	
	public void init(){
		System.out.println("�������ڿ�ʼ��");
		
	}
	
	public void destroy(){
		System.out.println("�౻������");
	}
	

}
