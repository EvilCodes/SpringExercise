package com.black.qualify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PhoneCollect {
	
	@Autowired
	@Qualifier("xiaoMi6s")
	private Phone miPhone;
	
	@Autowired
	@Qualifier("IPhoneX")
	private Phone iPhoneX;
	
	
	
	public void phoneNum(){
		System.out.println("��һ��ӵ�������ֻ�");
		
	}
	public void showDesc(){
		System.out.println("��һ���ֻ���"+miPhone.toString());
		System.out.println("�ڶ����ֻ���"+iPhoneX.toString());
		
	}
	
	

}
