package com.capsule;

public class MyClass {
	
	private String name;
	private int age;
	
	public MyClass(){	//��ȯ���°� ���� ���� �������� Ư¡, ���ڰ��� ������ ����Ʈ������
		
	}
	
	public MyClass(String n){
		name = n;
	}
	
	public MyClass(String n, int a){
		name = n;
		age = a;
		System.out.println("��ü�� �����Ǿ����ϴ�.");
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
