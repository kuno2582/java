package com.staticex;

public class MyClass {
	
	public void makeMyClass(){
		
		MyClass myclass = new MyClass();
		System.out.println("�ڽ��� ���� Ŭ������ �ν��Ͻ� ����");
		System.out.println(myclass);
		
	}

	public static void main(String[] args) {
		
		MyClass myClass1 = new MyClass();
		myClass1.makeMyClass();
		
		MyClass myClass2 = new MyClass();
		myClass2.makeMyClass();
		
	}

}
