package com.stringbuilderex;
/*
StringBuilder클래스
 - 문자열 저장 및 변경을 하기위한 메모리 공간을 가지고 있는 클래스
 - 문자열 조합하는 클래스
 - 담겨진 데이터를 이용해서 문자열을 만들어주는 클래스
 append(), insert() 문자열 데이터를 추가
 
 String
 상수형태의 인스턴스 생성
 
 StringBuilder
 변수형태의 인스턴스 생성


*/
public class StringBuilderEx01 {

	public static void main(String[] args) {
		
		StringBuilder stringBuilder = new StringBuilder("Oracle");
		System.out.println(stringBuilder);
		
		stringBuilder.append(27);
		System.out.println(stringBuilder);
		
		stringBuilder.append('J').append(true);
		System.out.println(stringBuilder);
		
		stringBuilder.insert(9, "ava");	//9번째 자리 이후부터 추가
		System.out.println(stringBuilder);
		
		stringBuilder.insert(stringBuilder.length(),'Z');
		System.out.println(stringBuilder);

	}

}
