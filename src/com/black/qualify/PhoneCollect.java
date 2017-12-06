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
		System.out.println("您一共拥有两款手机");
		
	}
	public void showDesc(){
		System.out.println("第一款手机是"+miPhone.toString());
		System.out.println("第二款手机是"+iPhoneX.toString());
		
	}
	
	

}
