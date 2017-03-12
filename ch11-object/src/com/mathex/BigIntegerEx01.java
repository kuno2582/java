package com.mathex;
/*
BigInteger 클래스
 - 기본자료형의 범위를 넘어서는 점수를 표현하고자 할 때 사용
 - 큰 정수를 숫자로 표현 불가능 -> 문자열
 
*/

import java.math.*;

public class BigIntegerEx01 {

	public static void main(String[] args) {
		
		System.out.println("최대값: " + Long.MAX_VALUE);
		System.out.println("최소값: " + Long.MIN_VALUE);
		
		BigInteger bigValue1 = new BigInteger("10000000000000000000000000000");
		BigInteger bigValue2 = new BigInteger("-1000000000000000000000000000");
		
		BigInteger addResult1 = bigValue1.add(bigValue2);
		System.out.println(addResult1);
		
		BigInteger mulResult1 = bigValue1.multiply(bigValue1);
		System.out.println(mulResult1);
		
		BigInteger addResult2 = bigValue1.add(bigValue2);
		BigInteger mulResult2 = bigValue1.multiply(bigValue2);
		System.out.println("큰 수의 덧셈 결과: " + addResult2);
		System.out.println("큰 수의 곱셈 결과: " + mulResult2);

	}

}
