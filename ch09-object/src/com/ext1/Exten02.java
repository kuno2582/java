/*

����� Ư¡
 - ��ü���� IS-A���谡 �����Ǿ�� �մϴ�.
 - ���� ��� (Single)�� �����մϴ�.
 - �θ�Ŭ������ ���� �ڽ� Ŭ������ ���� �� ������ �ڽ�Ŭ������ �ϳ��� �θ� Ŭ������ 
 	���� �� �ֽ��ϴ�.
 	
�θ�Ŭ������ ���� ��ü ����
 - Ŭ���� ��ü�� ������ �� �θ� Ŭ������ ���� ��ü ������ �Ŀ� �ڽ��� Ŭ���� �����ϰ� �˴ϴ�.
 - �θ�Ŭ������ ���� �����Ǿ�� �ڽ� Ŭ������ �θ��� ����� ����� �� �ֱ� �����Դϴ�.
 
java.lang.ObjectŬ����
��� Ŭ������ ObjectŬ������ ��ӹް� �ֽ��ϴ�.

*/
package com.ext1;

class A {
	public void make(){
		System.out.println("�θ� Ŭ����");
	}
}

class B extends A{
	public void fun(){
		System.out.println("�ڽ� Ŭ����");
	}
}

public class Exten02 {

	public static void main(String[] args) {
		
		B b = new B();
		b.fun();
		b.make();

	}

}
