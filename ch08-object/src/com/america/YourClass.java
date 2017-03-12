package com.america;

public class YourClass {

	public void accessClass(MyClass myClass){
		myClass.setNumber(12);
		System.out.println(myClass.getNumber());
	}
	
	public static void main (String[] args){
		
		MyClass mc = new MyClass();
		YourClass yc = new YourClass();
		
		yc.accessClass(mc);
		
	}
	
}
