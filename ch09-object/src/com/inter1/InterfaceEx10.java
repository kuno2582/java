package com.inter1;
/*
인터페이스를 통한 표준화
인터페이스 생성				I
클래스 생성					B, C
클래스 인터페이스를 구현		B implements I, C implements I
클래스 생성					Z
클래스에 인터페이스 자료형으로 메소드 처리		메소드(I i)
클래스 객체 생성 후 메소드 호출				new Z()

*/

interface I {
	public abstract void play();
}

class B implements I {
	
	@Override
	public void play(){
		System.out.println("B클래스의 play");
	}
}

class C implements I {
	
	@Override
	public void play(){
		System.out.println("C클래스의 play");
	}
}

class Z {
	
	public void autoPlay(I i){
		i.play();
	}
}

public class InterfaceEx10 {

	public static void main(String[] args) {
		
		Z zp = new Z();
		zp.autoPlay(new B());
		zp.autoPlay(new C());

	}

}
