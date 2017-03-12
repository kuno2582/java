package com.ext4;

class A3 {
	
	int a = 100;
	
	public A3(String msg){
		System.out.println(msg);
	}
}

class B3 extends A3 {
	
	public B3(){
		super("인자가 있는 생성자");
	}
}

public class SuperEx03 {

	public static void main(String[] args) {
		
		B3 bb = new B3();
		System.out.println(bb);

	}

}
