package com.mathex;
/*
BigDecimal Ŭ����
 - Double�� �Ǽ��� ������ ����µ� �� ������ ������ �ϱ����� ���� Ŭ����


*/
import java.math.BigDecimal;

public class BigDecimalEx01 {

	public static void main(String[] args) {
		
		BigDecimal bg1 = new BigDecimal(2.7);
		BigDecimal bg2 = new BigDecimal(0.1);
		
		System.out.println("�� ���� ���� ���: " + bg1.add(bg2));
		System.out.println("�� ���� ���� ���: " + bg1.multiply(bg2));
		
		BigDecimal bg3 = new BigDecimal("2.7");
		BigDecimal bg4 = new BigDecimal("0.1");
		
		System.out.println("�� ���� �������: " + bg3.add(bg4));
		System.out.println("�� ���� �������: " + bg3.multiply(bg4));

	}

}
