package com.inner4;

class InnerParent4 {
	public void display(){
		System.out.println("�θ�Ŭ������ display");
	}
}

public class AnonymousEx04 {
	
	public void innerTest(){
		
		new InnerParent4(){
			@Override
			public void display(){
				System.out.println("�ڽ�Ŭ������ display");
			}
		}.display();
		
	}

	public static void main(String[] args) {
		
		AnonymousEx04 anony = new AnonymousEx04();
		anony.innerTest();

	}

}
