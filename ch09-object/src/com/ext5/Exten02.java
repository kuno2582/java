package com.ext5;

class A {
	
	public void playA(){
		System.out.println("AŬ����");
	}
}

class B extends A {
	
	public void playB(){
		System.out.println("BŬ����");
	}
}

public class Exten02 {

	public static void main(String[] args) {
		
		System.out.println("�ڽ� ��ü ����");
		B objb = new B();
		
		objb.playA();
		objb.playB();
		
		System.out.println("");
		System.out.println("��ĳ����");
		A obja = objb;
		obja.playA();
		//obja.playB();
		
		System.out.println("");
		System.out.println("�ٿ�ĳ����");
		B objb2 = (B)obja;
		objb2.playA();
		objb2.playB();
		
	}

}
