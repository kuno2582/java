package com.ext3;

class Parent {
	
	String msg = "Parent 클래스";
	public String getMessage(){
		return msg;
	}
}

class Child extends Parent{
	
	String msg = "Child 클래스";
	
	@Override
	public String getMessage(){
		return msg;
	}
	
}

public class OverridingEx02 {

	public static void main(String[] args) {
		
		Child c = new Child();
		System.out.println(c.getMessage());
		
		Parent p = new Child();
		System.out.println(p.getMessage());
		//참조변수의 자료형에 상관없이 오버라이딩된 메소드는 외부로부터 가리워진다.
		//마지막으로 오버라이딩한 메소드가 호출되게 된다.

	}

}
