package com.abs1;
/*
�߻�ȭ
 - ��ü���� ���信�� ����� �κе鸸 �߷����� ����ȭ�ϴ� ��
 - �߻�ȭ�Ǿ��� ������ ���� �̿ϼ����� �������� ���·� �ְ� �˴ϴ�.
 
 
�߻� �޼ҵ�
���������� abstract ��ȯ�� �޼ҵ�();


�߻� Ŭ����
 - �߻� �޼ҵ带 �ϳ��� ������ �Ǵ� Ŭ������ �ٷ� �߻� Ŭ����
 - �ϳ� �̻� abstract �޼ҵ带 �����ϴ� Ŭ������ abstract�� ����Ǿ�� �մϴ�.
 - ��ü������ �Ұ����մϴ�.
 - �������� ������ ����, �������̵� ���� �״�� ����
 
���������� abstract class Ŭ������{
}

*/

abstract class A {		//��ü ���� �Ұ�
	
	int a = 100;
	
	public void setA(int a){
		this.a = a;
	}
	
	public abstract void number();
	
}

class B extends A {
	
	int b = 200;
	
	@Override
	public void number(){
		System.out.println("number �޼ҵ�");
	}
}

public class AbstractEx01 {

	public static void main(String[] args) {
		
		B b1 = new B();
		System.out.println(b1.a);
		System.out.println(b1.b);
		
		b1.number();
		b1.setA(2000);
		System.out.println(b1.a);

	}

}
