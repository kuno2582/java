package com.inter1;
/*
인터페이스(Interface)
 - Tv의 리모콘, 음식점의 메뉴판

인터페이스 선언
 - 인터페이스 내에서는 상수 또는 추상메소드만 정의 가능
 - 인터페이스를 사용하기 위해서는 클래스에서 구현(implements)을 해줘야 합니다.
 - 클래스에서는 인터페이스가 가지고 있는 추상 메소드들을 하나도 빠짐없이 재정의(Override)해서 
 	사용해야 합니다.

접근제한자 interface 인터페이스명 {

}

추상화(abstract)
 - 구체적인 개념에서 공통된 부분만 추려내서 개념화 시킨것을 의미합니다.
 
 
 
추상 메소드 형식
 - 접근제한자 abstract 반환형 메소드명()


*/

interface InterfaceTest {

	//상수
	static final int A = 100;
	
	//추상메소드
	abstract int getA();
	
}

public class InterfaceEx01 implements InterfaceTest {

	//추상메소드 재정의
	@Override
	public int getA(){
		return A;
	}
	
	public static void main(String[] args) {
		
		InterfaceEx01 ife = new InterfaceEx01();
		System.out.println(ife.getA());

	}

}
