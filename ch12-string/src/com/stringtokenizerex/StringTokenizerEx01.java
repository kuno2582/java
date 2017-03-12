package com.stringtokenizerex;
/*
StringTokenizer 클래스
문자열 분리 객체
nextToken() 메소드를 이용해서 문자열 분리

*/
import java.util.StringTokenizer;

public class StringTokenizerEx01 {

	public static void main(String[] args) {
		
		String source = "100,200,300,400,500";
		
		StringTokenizer st = new StringTokenizer(source,",");
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}

	}

}
