package com.mathex;
/*
java.util.Random 클래스

nextInt(int n)
- 0부터 인자로 전달받은 n값의 전까지의 범위로 난수를 발생 시킵니다.(n-1)
- 0부터 n미만의 int형 난수 반환


*/

import java.util.Random;

public class RandomEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] luck = {"로또 당첨", "오늘하루 휴일", "여유로운 하루",
				"즐거운 만남", "그냥 그냥", "에라~모르겠다"};
		
		Random r1 = new Random();
		System.out.println(luck[r1.nextInt(6)]);

	}

}
