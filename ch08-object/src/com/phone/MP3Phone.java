package com.phone;

public class MP3Phone extends CellPhone {
	
	private int size;
	private String color;
	
	public MP3Phone (String model, String number, int bellsound, int size,
			String color){
		
		this.model = model;
		this.number = number;
		this.bellsound = bellsound;
		this.size = size;
		this.color = color;
	}
	
	public int getSize(){
		return size;
	}
	
	public String getColor(){
		return color;
	}
	
}
