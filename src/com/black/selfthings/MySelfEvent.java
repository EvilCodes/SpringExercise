package com.black.selfthings;

import org.springframework.context.ApplicationEvent;

public class MySelfEvent extends ApplicationEvent{

	public MySelfEvent(Object source) {
		super(source);
	}
	
	public String toString(){
		return "用户自定义的Event";
	}
	

}
