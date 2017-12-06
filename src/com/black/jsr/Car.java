package com.black.jsr;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Car {
	
	private String name;
	private String color;
	private String style;
	private int speed;
	private CarDesc carDesc;
	
	
	
	public CarDesc getCarDesc() {
		return carDesc;
	}
	@Resource(name="carDesc")
	public void setCarDesc(CarDesc carDesc) {
		this.carDesc = carDesc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String styel) {
		this.style = styel;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", style=" + style + ", speed=" + speed + ", carDesc="
				+ carDesc + "]";
	}
	@PostConstruct
	public void init(){
		
		System.out.println("@PostConstruct类被初始化");
	}
	@PreDestroy
	public void destroy(){
		System.out.println("@PreDestroy类被销毁");
	}
	

}
