package com.inter1;
/*
�������̽�(Interface)
 - Tv�� ������, �������� �޴���

�������̽� ����
 - �������̽� �������� ��� �Ǵ� �߻�޼ҵ常 ���� ����
 - �������̽��� ����ϱ� ���ؼ��� Ŭ�������� ����(implements)�� ����� �մϴ�.
 - Ŭ���������� �������̽��� ������ �ִ� �߻� �޼ҵ���� �ϳ��� �������� ������(Override)�ؼ� 
 	����ؾ� �մϴ�.

���������� interface �������̽��� {

}

�߻�ȭ(abstract)
 - ��ü���� ���信�� ����� �κи� �߷����� ����ȭ ��Ų���� �ǹ��մϴ�.
 
 
 
�߻� �޼ҵ� ����
 - ���������� abstract ��ȯ�� �޼ҵ��()


*/

interface InterfaceTest {

	//���
	static final int A = 100;
	
	//�߻�޼ҵ�
	abstract int getA();
	
}

public class InterfaceEx01 implements InterfaceTest {

	//�߻�޼ҵ� ������
	@Override
	public int getA(){
		return A;
	}
	
	public static void main(String[] args) {
		
		InterfaceEx01 ife = new InterfaceEx01();
		System.out.println(ife.getA());

	}

}
