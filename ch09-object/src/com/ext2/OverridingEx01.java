/*

Overriding(오버라이딩)
 - 부모클래스를 상속받은 자식클래스에서 부모클래스의 멤버메소드를 재정의하는 것
 - 메소드 오버라이딩, 메소드 재정의, 멤버 은폐라고도 합니다.
 - 서로 상속관계로 이루어진 객체들간의 관계에서 이루어집니다.
 - super클래스가 가지고 있는 메소드를 sub클래스에서 똑같은 것으로 새로 만들게되면
 	더 이상 super클래스에 있는 이름이 같은 메소드를 호출할 수 없게 됩니다.
 - 상위 클래스에 정의된 메소드의 이름, 반환형, 매개변수 선언까지 완전히 동일한 메소드를
 	하위 클래스에서 다시 정의해주게되면 하위클래스에 정의된 메소드에 의해 상위클래스의
 	메소드는 가리워지게 됩니다.
 	

오버라이딩 규칙
 - 상속 전제
 - 메소드 이름과 메소드 반환형이 반드시 동일해야합니다.
 - 메소드 인자리스트도 반드시 동일해야합니다.
 - 접근제한자가 static, final, private 지정자인 경우 해당메소드는 오버라이딩이 불가합니다.

*/

package com.ext2;

class Parent {
	public void make(){
		System.out.println("부모 클래스");
	}
}

class Child extends Parent {
	@Override	//재정의하겠다는 선언 annotation
	public void make(){
		System.out.println("자식 클래스");
	}
}

public class OverridingEx01 {

	public static void main(String[] args) {
		
		Child ch = new Child();
		ch.make();

	}

}
