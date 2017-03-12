package com.mathex;
/*
BigDecimal 클래스
 - Double형 실수는 오차가 생기는데 이 오차가 없도록 하기위해 쓰는 클래스


*/
import java.math.BigDecimal;

public class BigDecimalEx01 {

	public static void main(String[] args) {
		
		BigDecimal bg1 = new BigDecimal(2.7);
		BigDecimal bg2 = new BigDecimal(0.1);
		
		System.out.println("두 수의 덧셈 결과: " + bg1.add(bg2));
		System.out.println("두 수의 곱셈 결과: " + bg1.multiply(bg2));
		
		BigDecimal bg3 = new BigDecimal("2.7");
		BigDecimal bg4 = new BigDecimal("0.1");
		
		System.out.println("두 수의 덧셈결과: " + bg3.add(bg4));
		System.out.println("두 수의 곱셈결과: " + bg3.multiply(bg4));

	}

}
