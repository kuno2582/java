package com.wrapperex;
/*
Auto Boxing & Auto UnBoxing
Auto Boxing
 - �⺻ �ڷ��� �����Ͱ� �ڵ�����Wrapper�ν��Ͻ��� �������� ��
 - �⺻ �ڷ��� �����Ͱ� �;� �ϴµ�, Wrapper�ν��Ͻ��� �ִٸ�, Auto Boxing ����
 
Auto UnBoxing
 - Wrapper�ν��Ͻ��� ����� �����Ͱ� �ڵ����� �������� ��
 - �ν��Ͻ� �;� �ϴµ�, �⺻ �ڷ��� �����Ͱ� �ִٸ�, Auto UnBoxing ����


*/
public class WrapperEx02 {

	public static void main(String[] args) {
		
		Integer wrap_int = new Integer(10);
		int a = wrap_int + 10;	//Auto UnBoxing
		System.out.println(a);

		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer(120);
		int sum = obj1.intValue() + obj2.intValue();
		System.out.println("sum: " + sum);
		
		int result1 = obj1 * obj2;
		System.out.println(result1);
		
		Integer obj3 = 15;
		Integer obj4 = 20;
		
		Integer result2 = obj3 + obj4;	//��ڽ� �� �ڽ�
		System.out.println("result2: " + result2);
	}

}
