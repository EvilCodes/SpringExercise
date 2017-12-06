package com.black.annotasetting;

public class Bycycle {
	private String name;
	private String price;
	private String goods;
	private int weight;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getGoods() {
		return goods;
	}
	public void setGoods(String goods) {
		this.goods = goods;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void init(){
		System.out.println("自行车类被创建");
	}
	
	public void destroy(){
		System.out.println("自行车类被销毁");
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	@Override
	public String toString() {
		return "Bycycle [name=" + name + ", price=" + price + ", goods=" + goods + ", weight=" + weight + "]";
	}
	
	
	
	
	
	
	
	

}
