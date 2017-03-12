package com.inner4;
/*
Anonymous 내부 클래스(익명 내부 클래스)
 - 익명은 이름이 없는 것을 의미합니다. (정의된 클래스의 이름이 없다는 것)
 - local클래스와 동일하지만 클래스의 이름이 정의되어 있지 않다는 사실에만 차이가 있습니다.
 - 맨 마지막에 ; (세미콜론) 사용
 
 class Inner(){
 	
 }
 
 class Outer{
 	
 	Inner inner = new Inner(){
 	};
 	
 	public void method(){
 		new Inner(){
 		};
 	}
 }

*/

class InnerParent {
	
	public void display(){
		System.out.println("부모클래스의 display");
	}
	
}

public class AnnoymousEx01 {
	
	public void innerTest(){
		
		class Inner extends InnerParent {
			@Override
			public void display(){
				System.out.println("자식클래스의 display");
			}
		}
		
		Inner i = new Inner();
		i.display();
	}

	public static void main(String[] args) {
		
		AnnoymousEx01 anony = new AnnoymousEx01();
		anony.innerTest();

	}

}
