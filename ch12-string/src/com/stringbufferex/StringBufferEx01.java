package com.stringbufferex;
/*
StringBuffer클래스
 - 문자열 버퍼 객체
 - 문자열 추가 변경


*/
public class StringBufferEx01 {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("Code");
		StringBuffer sb2 = sb1.append(" Dragon");
		
		String str = null;
		
		if(sb1 == sb2)
			str = "sb1과 sb2는 서로 같습니다.";
		else
			str = "sb1과 sb2는 서로 다릅니다.";
		
		System.out.println(str);
		
		str = sb1.toString();
		System.out.println("sb1: " + str);
		
		str = sb2.toString();
		System.out.println("sb2: " + str);

	}

}
