package com.object1;
/*

Object Class(������Ʈ Ŭ����)
 - ��� Ŭ������ �ֻ��� Ŭ����
 - extends ���� �ʾƵ� �ڵ����� ����մϴ�.
 
 
�ν��Ͻ����� ���� �񱳸� ���� �޼ҵ带 ���� -> equals()
 - ==�����ڷ� �� -> ��ü == ��ü 			���۷����� ���ϰ� ��.(������ ��)
 - �ν��Ͻ��� ������ ���ؼ� equals()�� �������ؼ� ����ؾ� �մϴ�.

public boolean equals(Object object){	//������ �񱳹ۿ� ����� ����
	return (this == object);
}

*/

class IntNumber{
	int num;
	
	public IntNumber(int num){
		this.num = num;
	}
	
	public boolean isEquals(IntNumber numObj){
		if(this.num == numObj.num)
			return true;
		else
			return false;
	}
}

public class ObjectClassEx01 {

	public static void main(String[] args) {
		
		IntNumber num1 = new IntNumber(10);
		IntNumber num2 = new IntNumber(15);
		IntNumber num3 = new IntNumber(10);
		
		if(num1 == num2)
			System.out.println("num1 == num2");
		else if(num1 == num3){
			System.out.println("num1 == num3");
		}else{
			System.out.println("no match");
		}
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		if(num1.isEquals(num2)){
			System.out.println("num1�� num2�� ���� ����");
		}else{
			System.out.println("num1�� num2�� �ٸ� ����");
		}
		
		if(num1.isEquals(num3)){
			System.out.println("num1�� num3�� ���� ����");
		}else{
			System.out.println("num1�� num3�� �ٸ� ����");
		}

	}

}
