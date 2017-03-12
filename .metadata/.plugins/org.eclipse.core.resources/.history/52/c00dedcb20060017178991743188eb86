package com.inner1;
/*

내부 클래스(Inner Class)
 - 특정 클래스 안에 또 다른 클래스가 정의되어져 있는 클래스
 - 하나의 멤버처럼 사용하기 위해서 
 - 내부클래스는 외부클래스의 모든 멤버들을 마치 자신의 멤버처럼 사용할 수 있습니다.
 - 내부클래스 생성하려면 외부클래스의 객체를 생성한 후에 객체를 생성할 수 있습니다.
 
 
class Outer클래스 {
	//멤버변수
	 
	class Inner클래스 {
	
	}
	
}

내부 클래스 종류
Member		멤버변수나 멤버메소드와 같이 클래스가 정의되어져서 사용
Local		메소드안에 클래스가 정의되어 사용
Static		static변수와 같이 클래스가 static으로 선언된 경우
Anonymous	참조할 수 있는 이름이 없는 경우에 사용


내부클래스 특징
 - Outer클래스의 객체생성 후에 Inner클래스의 객체 생성할 수 있습니다.
 - Inner클래스 내에서는 Out클래스의 멤버에 직접 접근이 가능합니다.
 - Inner클래스의 인스턴스는 자신이 속한 Outer클래스의 인스턴스를 기반으로 생성됩니다.


*/

class Outer {
	
	int x = 100;
	
	class Inner {
		int y = 200;
	}
	
}




public class MemberEx01 {

	public static void main(String[] args) {
		
		Outer ot = new Outer();
		Outer.Inner oi = ot.new Inner();
		
		System.out.println("x: " + ot.x);
		System.out.println("y: " + oi.y);

	}

}
