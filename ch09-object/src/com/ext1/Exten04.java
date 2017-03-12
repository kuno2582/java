
package com.ext1;
/*

private		<	default		<	protected	<	public
클래스 내부		<	동일 패키지		<	상속 클래스		<	아무 관계없이
*/
class Bird {
	int num1;
	protected int num2;
	
	public void fly(){
		System.out.println("부모클래스");
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
	}
}

class Eagle extends Bird {
	
	Eagle(){
		num1 = 10;
		num2 = 20;
	}
	
	public void eat(){
		System.out.println("자식클래스");
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
	}
}

public class Exten04 {

	public static void main(String[] args) {
		
		Eagle eagle = new Eagle();
		eagle.eat();
		eagle.fly();

	}

}
