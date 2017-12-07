package com.black.thingslistenter;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class ThingStart implements ApplicationListener<ContextStartedEvent>{

	@Override
	public void onApplicationEvent(ContextStartedEvent cse) {
		System.out.println("ContextStartedEvent收到");
	}

}
