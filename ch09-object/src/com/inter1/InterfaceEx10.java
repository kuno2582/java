package com.inter1;
/*
�������̽��� ���� ǥ��ȭ
�������̽� ����				I
Ŭ���� ����					B, C
Ŭ���� �������̽��� ����		B implements I, C implements I
Ŭ���� ����					Z
Ŭ������ �������̽� �ڷ������� �޼ҵ� ó��		�޼ҵ�(I i)
Ŭ���� ��ü ���� �� �޼ҵ� ȣ��				new Z()

*/

interface I {
	public abstract void play();
}

class B implements I {
	
	@Override
	public void play(){
		System.out.println("BŬ������ play");
	}
}

class C implements I {
	
	@Override
	public void play(){
		System.out.println("CŬ������ play");
	}
}

class Z {
	
	public void autoPlay(I i){
		i.play();
	}
}

public class InterfaceEx10 {

	public static void main(String[] args) {
		
		Z zp = new Z();
		zp.autoPlay(new B());
		zp.autoPlay(new C());

	}

}
