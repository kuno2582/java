package com.ext4;
/*

super
 - this�� �Բ� ��ü�� ������ �� �ִ� reference����
 - this: Ư����ü ������ ���� �ڽ��� ��ü�� ������ �� �ִ� ���� ����
 - super: ���� ��ü�� �ٷ� ������ superŬ����(�θ�Ŭ����)�� ������ �� �ִ� reference
 
 
super(����)
 - superŬ������ ������
 - ���ڰ� �ִٸ� ������ ���¿� ��ġ�ϴ� �����ڸ� �ǹ�

*/

class A {
	int a = 100;
	
	public void play(){
		System.out.println("�θ�Ŭ������ play");
	}
}

class B extends A {
	
	public B(){
		super.play();
		
		System.out.println("super.a: " + super.a);
	}
	
	public void getParentPlay(){
		super.play();
		System.out.println("super.a: " + super.a);
	}
	
	@Override
	public void play(){
		System.out.println("�ڽ� Ŭ������ play");
	}
}

public class SuperEx01 {

	public static void main(String[] args) {
		
		System.out.println("�����ڸ� ���� �θ� �޼ҵ� ȣ��: ");
		B bb = new B();
		bb.play();
		
		System.out.println("�ڽ�Ŭ�������� ������ �޼ҵ带 �����Ͽ� " 
				+" �θ�޼ҵ� ȣ��");
		
		bb.getParentPlay();

	}

}
