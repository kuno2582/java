package com.ext5;

class Parent3 {
	
	int a = 100;
	
	public void play(){
		System.out.println("�θ� Ŭ����");
	}
}

class Child3 extends Parent3{
	
	int a = 200;
	
	@Override
	public void play(){
		System.out.println("�ڽ� Ŭ����");
	}
}

public class Exten03 {

	public static void main(String[] args) {
		
		Child3 ch = new Child3();
		System.out.println(ch.a);
		
		System.out.println("\n��ĳ����");
		Parent3 pa = ch;
		System.out.println(pa.a);
		pa.play();
		

	}

}
