package com.inner3;
/*
로컬 내부 클래스 특징
 - 지역변수처럼 사용
 - 로컬내부 클래스의 생성시점은 메소드가 호출될 때 
 - 로컬내부 클래스의 소멸시점은 메소드가 종료될 때 
 - Outer클래스의 멤버변수와 상수값만 접근가능
 - 로컬내부 클래스가 정의된 메소드내의 로컬변수에는 접근할 수 없습니다.
 - 로컬내부 클래스의 객체생성은 해당 클래스가 포함된 메소드에서만 가능합니다.
 
로컬 클래스의 지역변수와 매개변수 접근
 - 메소드가 반환되는 순간 매개변수와 지역변수는 소멸됩니다.
 - 단, final로 선언된 변수의 접근은 허용합니다.

*/

public class LocalEx02 {

	int a = 100;
	
	public void innerTest(){
		
		int b = 200;
		
		class Inner {
			int c = 300;
			final int NUM = 400;
			
			public void getData(){
				System.out.println("a: " + a);
				
				System.out.println("b: " + b);
				
				System.out.println("c: " + c);
				
				System.out.println("NUM: " + NUM);
			}
		}
		
		Inner in = new Inner();
		in.getData();
		
	}
	
	public static void main(String[] args) {
		
		LocalEx02 lo = new LocalEx02();
		lo.innerTest();

	}

}
