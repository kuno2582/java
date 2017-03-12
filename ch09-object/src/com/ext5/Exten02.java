package com.ext5;

class A {
	
	public void playA(){
		System.out.println("A클래스");
	}
}

class B extends A {
	
	public void playB(){
		System.out.println("B클래스");
	}
}

public class Exten02 {

	public static void main(String[] args) {
		
		System.out.println("자식 객체 생성");
		B objb = new B();
		
		objb.playA();
		objb.playB();
		
		System.out.println("");
		System.out.println("업캐스팅");
		A obja = objb;
		obja.playA();
		//obja.playB();
		
		System.out.println("");
		System.out.println("다운캐스팅");
		B objb2 = (B)obja;
		objb2.playA();
		objb2.playB();
		
	}

}
