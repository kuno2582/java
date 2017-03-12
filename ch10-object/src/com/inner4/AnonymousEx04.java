package com.inner4;

class InnerParent4 {
	public void display(){
		System.out.println("부모클래스의 display");
	}
}

public class AnonymousEx04 {
	
	public void innerTest(){
		
		new InnerParent4(){
			@Override
			public void display(){
				System.out.println("자식클래스의 display");
			}
		}.display();
		
	}

	public static void main(String[] args) {
		
		AnonymousEx04 anony = new AnonymousEx04();
		anony.innerTest();

	}

}
