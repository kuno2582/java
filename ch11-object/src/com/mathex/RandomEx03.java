package com.mathex;
/*

Random 클래스 이용
0부터 2000미만의 난수가 총 100 출력되도록 프로그램


*/

import java.util.Random;

public class RandomEx03 {

	public static void main(String[] args) {
		
		Random rand = new Random();

		for(int i=0; i<100 ;i++){
			System.out.println( rand.nextInt(2000) );
		}
	}
}
