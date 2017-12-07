package com.black.aop;

public class Game {
	
	private String name;
	private int size;
	private int playerNum;
	private String type;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getPlayerNum() {
		return playerNum;
	}
	public void setPlayerNum(int playerNum) {
		this.playerNum = playerNum;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Game [name=" + name + ", size=" + size + ", playerNum=" + playerNum + ", type=" + type + "]";
	}
	
	
	
	

}
