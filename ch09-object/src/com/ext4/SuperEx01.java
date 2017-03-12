package com.ext4;
/*

super
 - this와 함께 객체를 참조할 수 있는 reference변수
 - this: 특정객체 내에서 저기 자신의 객체를 참조할 수 있는 참조 변수
 - super: 현재 객체의 바로 상위인 super클래스(부모클래스)를 참조할 수 있는 reference
 
 
super(인자)
 - super클래스의 생성자
 - 인자가 있다면 인자의 형태와 일치하는 생성자를 의미

*/

class A {
	int a = 100;
	
	public void play(){
		System.out.println("부모클래스의 play");
	}
}

class B extends A {
	
	public B(){
		super.play();
		
		System.out.println("super.a: " + super.a);
	}
	
	public void getParentPlay(){
		super.play();
		System.out.println("super.a: " + super.a);
	}
	
	@Override
	public void play(){
		System.out.println("자식 클래스의 play");
	}
}

public class SuperEx01 {

	public static void main(String[] args) {
		
		System.out.println("생성자를 통한 부모 메소드 호출: ");
		B bb = new B();
		bb.play();
		
		System.out.println("자식클래스에서 별도의 메소드를 생성하여 " 
				+" 부모메소드 호출");
		
		bb.getParentPlay();

	}

}
