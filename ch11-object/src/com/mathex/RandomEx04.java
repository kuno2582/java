package com.mathex;
/*
가짜 난수(Pseudo-random number)
- 씨드(seed)가 동일하면 생성되는 난수의 패턴은 100% 동일한 난수가 발생합니다.
- 컴퓨터의 난수는 씨앗을 기반으로 생성되기 때문에 가짜 난수라고 불립니다.

*/
import java.util.Random;

public class RandomEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random(7);	//실행시킬때마다 같은 난수 생성
		
		for(int i=0; i<10 ;i++){
			System.out.println(rand.nextInt(100));
		}
		

	}

}
