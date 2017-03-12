package com.inter1;
/*
�������̽� ���
 - �������̽������� ��� �Ǵ� �߻�޼ҵ�鸸 ���ǵ˴ϴ�.
 - �������̽��� �����ϰڴٰ� ����� Ŭ�������� ���ϴ� ���·� ������ �� ���־�� �մϴ�.
 - ���� �����κ��� ���� �������̽��鰣���� ���� ����� �� �� �ֽ��ϴ�.
 
 
���������� interface �������̽��� extends �θ��������̽���1, 2, 3, ... {
	���;
	�߻�޼ҵ�;
}


�������̽� ��ӿ��� �߻�޼ҵ� ����
 - �߻�޼ҵ�� �ش� �������̽��� �ٸ� �������̽��κ��� ����� �޾����� 
 	������(Overriding)�� �� �� �����ϴ�.
 	
 - ��ӹ��� �ڽ� �������̽��� �����ϴ� Ŭ�������� �ڽ��������̽��� �ִ� �߻�޼ҵ��
 	�θ��������̽��� �ִ� �߻�޼ҵ� ��� Overriding(������)�ؾ� �մϴ�.


*/

interface Inter1 {
	public int getA();
}

interface Inter2 {
	public abstract int getB();
}

interface Inter3 extends Inter1,Inter2 {
	
	public int getData();
}

interface Inter4 {
	
	public abstract int getC();
}

public class InterfaceEx06 implements Inter3, Inter4{

	@Override
	public int getA(){
		return 100;
	}
	
	@Override
	public int getB(){
		return 200;
	}
	
	@Override
	public int getC(){
		return 400;
	}
	
	@Override
	public int getData(){
		return 300;
	}
	
	public static void main(String[] args) {
		
		InterfaceEx06 ife = new InterfaceEx06();
		System.out.println(ife.getA());
		System.out.println(ife.getB());
		System.out.println(ife.getC());
		System.out.println(ife.getData());

	}

}
