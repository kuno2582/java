/*

상속의 특징
 - 객체간의 IS-A관계가 성립되어야 합니다.
 - 단일 상속 (Single)만 가능합니다.
 - 부모클래스는 여러 자식 클래스를 가질 수 있지만 자식클래스는 하나의 부모 클래스만 
 	가질 수 있습니다.
 	
부모클래스를 먼저 객체 생성
 - 클래스 객체가 생성될 때 부모 클래스를 먼저 객체 생성한 후에 자신의 클래스 생성하게 됩니다.
 - 부모클래스가 먼저 생성되어야 자식 클래스가 부모의 멤버를 사용할 수 있기 때문입니다.
 
java.lang.Object클래스
모든 클래스는 Object클래스를 상속받고 있습니다.

*/
package com.ext1;

class A {
	public void make(){
		System.out.println("부모 클래스");
	}
}

class B extends A{
	public void fun(){
		System.out.println("자식 클래스");
	}
}

public class Exten02 {

	public static void main(String[] args) {
		
		B b = new B();
		b.fun();
		b.make();

	}

}
