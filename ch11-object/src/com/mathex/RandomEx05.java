package com.mathex;

import java.util.Random;

public class RandomEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random(12);
		
		System.out.println(System.currentTimeMillis());
		
		random.setSeed(System.currentTimeMillis());
		
		for(int i=0; i<10 ;i++){
			System.out.println(random.nextInt(100));
		}
	}

}
