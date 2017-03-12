package com.capsule;

public class MyClass {
	
	private String name;
	private int age;
	
	public MyClass(){	//반환형태가 없는 것이 생성자의 특징, 인자값이 없으면 디폴트생성자
		
	}
	
	public MyClass(String n){
		name = n;
	}
	
	public MyClass(String n, int a){
		name = n;
		age = a;
		System.out.println("객체가 생성되었습니다.");
	}
	
	public void setName(String n){
		name = n;
	}
	
	public void setAge(int a){
		age = a;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
}
