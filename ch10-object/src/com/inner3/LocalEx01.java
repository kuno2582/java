package com.inner3;
/*
로컬 내부 클래스(Local Inner Class)
 - Outer클래스의 메소드안에 접속된 클래스
 - Inner클래스의 특징을 가지고 있습니다.
 - 특정 메소드 안에 정의되어져 있는 클래스 (특정 메소드 안에서 선언한 지역변수와 같습니다.)
 - Local클래스는 메소드 내에 정의가 되어, 메소드 내에서만 객체 생성이 가능합니다.
 
 
class Outer클래스 {

	public void method() {
		class Inner클래스 {
		
		}
	}
}


*/
public class LocalEx01 {
	
	public void innerTest(){
		
		class Inner {
			
			public void getData(){
				System.out.println("Local 내부 클래스");
			
			}
		}
		
		Inner i = new Inner();
		i.getData();
		
		
	}
	
	public static void main (String[] args) {
	
		LocalEx01 io = new LocalEx01();
		io.innerTest();
		
		
	}
	
}
