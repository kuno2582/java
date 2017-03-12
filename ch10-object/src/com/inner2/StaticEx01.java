package com.inner2;
/*

static 내부 클래스
 - 내부클래스안에 static변수를 가지고 있다면 그 내부클래스는 static으로 정의해야합니다.

*/
public class StaticEx01 {

	public static class  StaticInner {
		int iv = 200;
		static int cv = 300;
	}
	
	public static void main(String[] args) {
		
		StaticEx01.StaticInner ii = new StaticEx01.StaticInner();
		
		System.out.println(ii.iv);
//		System.out.println(ii.cv);	추천하지 않는 static 호출 방식
		
		System.out.println(StaticEx01.StaticInner.cv);	//추천하는 방식

	}

}
