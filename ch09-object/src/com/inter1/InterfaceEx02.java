/*package com.inter1;

인터페이스 정의 및 사용 단계
1) 인터페이스 정의
2) class에 구현(implements)하고 인터페이스 추상 메소드는 재정의(구체화)
3) class의 객체 생성
4) 객체를 통해서 메소드 호출


인터페이스 특징
 - 상속구조를 통해서 둘 이상의 클래스의 상속관계를 형성하기 위해 사용(다중상속 가능)
 - 인스턴스화 하기 위해 정의된 클래스가 아닙니다.
 - 인터페이스 내에 선언된 변수 무조건 public static final로 선언(상수)
 - 인터페이스 내에 선언된 메소드 무조건 public abstract로 선언(추상메소드)



interface A {
	
	public abstract void getB();
	
	void getC();
}

class B implements A {
	
	@Override
	public void getB(){
		System.out.println("getB 메소드");
	}
	
	@Override
	public void getC(){
		System.out.println("getC 메소드");
	}
}

public class InterfaceEx02 {

	public static void main(String[] args) {
		
		B b = new B();
		b.getB();
		b.getC();

	}

}
*/