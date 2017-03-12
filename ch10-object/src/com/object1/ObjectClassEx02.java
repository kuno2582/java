package com.object1;
/*
equals () �޼ҵ�
 - ��ü�� �ν��Ͻ� �� ��
 - ��ü �񱳽� �������� ������ �ʰ� ��ġ���� ��
 - �������� ���ϱ� ���ؼ��� equals�޼ҵ带 �������̵�(������)�ؼ� ����ؾ��մϴ�.
 

*/

class IntNumber2 {
	int num;
	
	public IntNumber2(int num){
		this.num = num;
	}
	
	@Override
	public boolean equals(Object obj){
		if(this.num == ((IntNumber2)obj).num){
			return true;
		}else{
			return false;
		}
		
	}
}

public class ObjectClassEx02 {

	public static void main(String[] args) {
		
		IntNumber2 num1 = new IntNumber2(10);
		IntNumber2 num2 = new IntNumber2(15);
		IntNumber2 num3 = new IntNumber2(10);
		
		if(num1.equals(num2))
			System.out.println("num1�� num2�� ���� ����");
		else
			System.out.println("num1�� num2�� �ٸ� ����");
		
		if(num1.equals(num3))	//��ü ������ ���̱� ������ ���ϴ´�� ������ ����
			System.out.println("num1�� num3�� ���� ����");
		else
			System.out.println("num1�� num3�� �ٸ� ����");

	}

}
