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
		System.out.println("�ཫ����ʼ��");
		
	}
	public void destroy(){
		
		System.out.println("�����Ѿ�������");
	}
	

}
