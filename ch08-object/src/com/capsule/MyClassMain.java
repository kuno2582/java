package com.capsule;

public class MyClassMain {

	public static void main(String[] args) {
		
		MyClass mc1 = new MyClass();
		
		mc1.setName("유노");
		mc1.setAge(16);
		System.out.println(mc1.getName() + "\t" + mc1.getAge());
		
		MyClass mc2 = new MyClass("김연아");
		System.out.println(mc2.getName() + "\t" + mc2.getAge());
		
		MyClass mc3 = new MyClass("손연재", 22);
		System.out.println(mc3.getName() + "\t" + mc3.getAge());

	}

}
