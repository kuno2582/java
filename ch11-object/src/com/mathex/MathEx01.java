package com.mathex;
/*
Math 클래스
 - 수학관련 메소드들이 static으로 정의되어 있다.
 - API 문서를 통해서 참조


*/
public class MathEx01 {

	public static void main(String[] args) {
		
		int i = Math.abs(-19);
		System.out.println(i);
		
		double d = Math.ceil(3.3);
		System.out.println(d);
		
		double d2 = Math.floor(3.3);
		System.out.println(d2);
		
		i = Math.round(4.7F);
		System.out.println(i);
		
		i = Math.max(5,9);
		System.out.println(i);
		
		i = Math.min(5,9);
		System.out.println(i);

	}

}
