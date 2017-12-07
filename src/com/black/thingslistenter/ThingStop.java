package com.black.thingslistenter;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class ThingStop implements ApplicationListener<ContextStoppedEvent>{

	@Override
	public void onApplicationEvent(ContextStoppedEvent cse) {
		System.out.println("ContextStoppedEvent收到");
		
	}

}
