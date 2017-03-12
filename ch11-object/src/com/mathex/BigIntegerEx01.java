package com.mathex;
/*
BigInteger Ŭ����
 - �⺻�ڷ����� ������ �Ѿ�� ������ ǥ���ϰ��� �� �� ���
 - ū ������ ���ڷ� ǥ�� �Ұ��� -> ���ڿ�
 
*/

import java.math.*;

public class BigIntegerEx01 {

	public static void main(String[] args) {
		
		System.out.println("�ִ밪: " + Long.MAX_VALUE);
		System.out.println("�ּҰ�: " + Long.MIN_VALUE);
		
		BigInteger bigValue1 = new BigInteger("10000000000000000000000000000");
		BigInteger bigValue2 = new BigInteger("-1000000000000000000000000000");
		
		BigInteger addResult1 = bigValue1.add(bigValue2);
		System.out.println(addResult1);
		
		BigInteger mulResult1 = bigValue1.multiply(bigValue1);
		System.out.println(mulResult1);
		
		BigInteger addResult2 = bigValue1.add(bigValue2);
		BigInteger mulResult2 = bigValue1.multiply(bigValue2);
		System.out.println("ū ���� ���� ���: " + addResult2);
		System.out.println("ū ���� ���� ���: " + mulResult2);

	}

}
