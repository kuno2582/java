package com.prac1;

class Item1 {
	private String name;
	
	public Item1(String name){
		this.name= name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class Test {
	public static void passOne(Item1 item){
		item.setName("SmartPhone");
	}
	
	public static void passTwo(Item1 item){
		item.setName("NoteBook");
	}
	
	public static void main(String[] args){
		Item1 item = new Item1("Car");
		passOne(item);
		System.out.print(item.getName() + "'");
		passTwo(item);
		System.out.println(item.getName());
	}
}