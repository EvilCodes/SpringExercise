package com.black.selfthings;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class MySelfPublisher implements ApplicationEventPublisherAware{
	private ApplicationEventPublisher publisher;
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher=publisher;
	}
	
	public void publish(){
		MySelfEvent event=new MySelfEvent(this);
		publisher.publishEvent(event);
		
	}

}
