package com.ext5;
/*

��ü���� ����ȯ

���� ����ȯ(Upcasting)
 - �ڽ�Ŭ���� Ÿ�Կ��� �θ�Ŭ���� Ÿ������ ����
 - �ڵ������� ����ȯ
 
���� ����ȯ(Downcasting)
 - �θ�Ŭ���� Ÿ�Կ��� �ڽ�Ŭ���� Ÿ������ ����
 - ���������� ����ȯ
 
 
 
ȣ�⿵��
��ü ������ �ڷ��� ����		ȣ�⿵��
�ڽ�Ŭ���� Ÿ������			�θ�Ŭ���� + �ڽ�Ŭ���� ��� ȣ�� ����
�θ�Ŭ���� Ÿ������			�θ�Ŭ����

*/

class Parent {
	
	int a = 100;
}

class Child extends Parent {
	
	int b = 200;
}

public class Exten01 {

	public static void main(String[] args) {
		
		Child ch = new Child();
		System.out.println(ch.a);
		System.out.println(ch.b);
		
		System.out.println("��ĳ����(�ڽ�->�θ�)");
		Parent pa = ch;
		System.out.println(pa.a);
		//System.out.println(pa.b);
		
		System.out.println("�ٿ�ĳ����(�θ�->�ڽ�)");
		Child ch2 = (Child)pa;
		System.out.println(ch2.a);
		System.out.println(ch2.b);
		
	}

}