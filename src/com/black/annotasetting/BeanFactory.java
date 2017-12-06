package com.black.annotasetting;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.black.jsr.Car;

@Configuration
public class BeanFactory {
	
	@Bean(name="bus")
	@Scope("prototype")
	public Bus getBus(){
		return new Bus();
	}
	
	@Bean(initMethod="init",destroyMethod="destroy")
	public Bycycle getBycycle(){
		return new Bycycle();
	} 

	@Bean
	@Scope("prototype")
	public Car getCar(){
		return new Car();
	}
}
