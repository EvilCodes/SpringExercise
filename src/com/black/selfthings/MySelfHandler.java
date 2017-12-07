package com.black.selfthings;

import org.springframework.context.ApplicationListener;

public class MySelfHandler implements ApplicationListener<MySelfEvent>{

	@Override
	public void onApplicationEvent(MySelfEvent event) {
		System.out.println(event.toString());
		
	}
	

}
