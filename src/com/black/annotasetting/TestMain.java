package com.black.annotasetting;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.black.jsr.Car;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context =new AnnotationConfigApplicationContext(BeanFactory.class);
		Bus bus=(Bus) context.getBean("bus");
		Bus bus2=context.getBean(Bus.class);
		Bus bus3=context.getBean(Bus.class);
		System.out.println("car.hascode="+bus2.hashCode()+",car2.hascode="+bus3.hashCode());
		bus.setName("399¿Í³µ");
		System.out.println(bus.getName());
		Bycycle bycycle = context.getBean(Bycycle.class);
		bycycle.destroy();
	}
}