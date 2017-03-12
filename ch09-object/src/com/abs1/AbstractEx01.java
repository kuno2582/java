package com.abs1;
/*
추상화
 - 구체적인 개념에서 공통된 부분들만 추려내서 개념화하는 것
 - 추상화되었기 때문에 아직 미완성적인 개념적인 상태로 있게 됩니다.
 
 
추상 메소드
접근제한자 abstract 반환형 메소드();


추상 클래스
 - 추상 메소드를 하나라도 가지게 되는 클래스가 바로 추상 클래스
 - 하나 이상 abstract 메소드를 포함하는 클래스는 abstract로 선언되어야 합니다.
 - 객체생성은 불가능합니다.
 - 참조변수 선언은 가능, 오버라이딩 원리 그대로 적용
 
접근제한자 abstract class 클래스명{
}

*/

abstract class A {		//객체 생성 불가
	
	int a = 100;
	
	public void setA(int a){
		this.a = a;
	}
	
	public abstract void number();
	
}

class B extends A {
	
	int b = 200;
	
	@Override
	public void number(){
		System.out.println("number 메소드");
	}
}

public class AbstractEx01 {

	public static void main(String[] args) {
		
		B b1 = new B();
		System.out.println(b1.a);
		System.out.println(b1.b);
		
		b1.number();
		b1.setA(2000);
		System.out.println(b1.a);

	}

}
