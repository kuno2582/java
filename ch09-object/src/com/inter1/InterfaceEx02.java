/*package com.inter1;

�������̽� ���� �� ��� �ܰ�
1) �������̽� ����
2) class�� ����(implements)�ϰ� �������̽� �߻� �޼ҵ�� ������(��üȭ)
3) class�� ��ü ����
4) ��ü�� ���ؼ� �޼ҵ� ȣ��


�������̽� Ư¡
 - ��ӱ����� ���ؼ� �� �̻��� Ŭ������ ��Ӱ��踦 �����ϱ� ���� ���(���߻�� ����)
 - �ν��Ͻ�ȭ �ϱ� ���� ���ǵ� Ŭ������ �ƴմϴ�.
 - �������̽� ���� ����� ���� ������ public static final�� ����(���)
 - �������̽� ���� ����� �޼ҵ� ������ public abstract�� ����(�߻�޼ҵ�)



interface A {
	
	public abstract void getB();
	
	void getC();
}

class B implements A {
	
	@Override
	public void getB(){
		System.out.println("getB �޼ҵ�");
	}
	
	@Override
	public void getC(){
		System.out.println("getC �޼ҵ�");
	}
}

public class InterfaceEx02 {

	public static void main(String[] args) {
		
		B b = new B();
		b.getB();
		b.getC();

	}

}
*/