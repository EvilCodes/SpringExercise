package com.black.beanpostprocessor;

public class HelloWorld {
	
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public void init(){
		System.out.println("类被初始化了");
		
	}
	public void destroy(){
		
		System.out.println("类已经被销毁了");
	}
	

}
