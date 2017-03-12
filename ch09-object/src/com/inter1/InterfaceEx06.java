package com.inter1;
/*
인터페이스 상속
 - 인터페이스내에는 상수 또는 추상메소드들만 정의됩니다.
 - 인터페이스의 구현하겠다고 명시한 클래스에서 원하는 형태로 구현을 꼭 해주어야 합니다.
 - 실제 구현부분이 없는 인터페이스들간에는 다중 상속을 할 수 있습니다.
 
 
접근제한자 interface 인터페이스명 extends 부모인터페이스명1, 2, 3, ... {
	상수;
	추상메소드;
}


인터페이스 상속에서 추상메소드 구현
 - 추상메소드는 해당 인터페이스가 다른 인터페이스로부터 상속을 받았지만 
 	재정의(Overriding)을 할 수 없습니다.
 	
 - 상속받은 자식 인터페이스를 구현하는 클래스에서 자식인터페이스에 있는 추상메소드와
 	부모인터페이스에 있는 추상메소드 모두 Overriding(재정의)해야 합니다.


*/

interface Inter1 {
	public int getA();
}

interface Inter2 {
	public abstract int getB();
}

interface Inter3 extends Inter1,Inter2 {
	
	public int getData();
}

interface Inter4 {
	
	public abstract int getC();
}

public class InterfaceEx06 implements Inter3, Inter4{

	@Override
	public int getA(){
		return 100;
	}
	
	@Override
	public int getB(){
		return 200;
	}
	
	@Override
	public int getC(){
		return 400;
	}
	
	@Override
	public int getData(){
		return 300;
	}
	
	public static void main(String[] args) {
		
		InterfaceEx06 ife = new InterfaceEx06();
		System.out.println(ife.getA());
		System.out.println(ife.getB());
		System.out.println(ife.getC());
		System.out.println(ife.getData());

	}

}
