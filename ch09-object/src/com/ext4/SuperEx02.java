package com.ext4;


class Parent {
	
	public Parent(){
		super();
	}
	
	int a;
}

class Child extends Parent{
	
	public Child(){
		super();
	}
	
	int b;
	
}

public class SuperEx02 {

	public static void main(String[] args) {
		
		Child ch = new Child();
		
		System.out.println(ch.a);
		System.out.println(ch.b);

		ch.a = 10;
		ch.b = 20;
		
		System.out.println(ch.a);
		System.out.println(ch.b);
	}

}
