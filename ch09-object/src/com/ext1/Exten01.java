/*

상속(Inheritance)
 - 객체의 특성을 그대로 물려받는 또 다른 객체를 만드는 것
 - 특정 클래스(super class)가 가지는 속성과 기능을 다른 새로운 클래스(sub class)에게
 	제공하기 위해 맞는 클래스들간의 관계
 - extends 사용
 - 멤버변수, 멤버메소드는 상속되지만 생성자는 상속이 되지 않습니다.
 - 상속을 통해 연관된 클래스에 대한 공통적인 규약을 정의하고 적용하기 위해서
 	상속을 사용하게 됩니다.
 - 상속관계에 있는 두 클래스 사이에는 IS-A관계가 성립해야 합니다.
 - 장점: 객체의 재사용성을 높인다. -> 코드의 간결화
 
 
클래스 상속 형식
 class 클래스B(sub class) extends 클래스A(super class) {}
 
  상속을 하기 위해 준비된 클래스, 물려주는 클래스, 상속을 해주는 쪽
 super class(상위 클래스, 슈퍼클래스)
 base class(기본 클래스, 기초 클래스, 기반 클래스)
 parent class(부모 클래스)
  
  특정 클래스로부터 상속을 받아 새롭게 정의되는 클래스, 물려받는 클래스, 상속을 받는 쪽
 sub class(하위 클래스)
 derivation class(유도 클래스, 파생 클래스)
 child class(자식 클래스)

*/
package com.ext1;

class Parent {
	int a = 100;
}

class Child extends Parent{
	int b = 200;
	int a = 300;
}

public class Exten01 {

	public static void main(String[] args) {
		
		Child ch = new Child();
		System.out.println(ch.a);

	}

}
