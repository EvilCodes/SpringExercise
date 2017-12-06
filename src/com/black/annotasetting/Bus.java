package com.black.annotasetting;

public class Bus {
	private String name;
	private String color;
	private String desc;
	private int price;
	private int speed;
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
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "Bus [name=" + name + ", color=" + color + ", desc=" + desc + ", price=" + price + ", speed=" + speed
				+ "]";
	}
	
	

}
