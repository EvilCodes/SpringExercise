package com.black.aop;

public class Logging {
	
	public void beforeMethod(){
		System.out.println("指定方法即将被执行");
	}
	
	public void afterRetrun(Object retVal){
		
		System.out.println(retVal+"指定方法已经返回数值");
	}
	
	public void afterMethod(){
		System.out.println("指定方法已经执行完毕");
		
	}
	public void throwException(Exception exception){
		System.out.println("方法抛出了异常"+exception.toString());
		
	}
	
	public void recycleMethod(){
		
		System.out.println("环绕调用");
	}
}
