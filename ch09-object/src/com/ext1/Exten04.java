
package com.ext1;
/*

private		<	default		<	protected	<	public
Ŭ���� ����		<	���� ��Ű��		<	��� Ŭ����		<	�ƹ� �������
*/
class Bird {
	int num1;
	protected int num2;
	
	public void fly(){
		System.out.println("�θ�Ŭ����");
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
		System.out.println("�ڽ�Ŭ����");
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
