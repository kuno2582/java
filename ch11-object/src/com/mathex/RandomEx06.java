package com.mathex;

import java.util.Random;

public class RandomEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random generator = new Random();
		
		int num1;
		num1 = generator.nextInt();
		System.out.println(num1);
		
		//0~9
		num1 = generator.nextInt(10);
		System.out.println(num1);
		
		//1~10
		num1 = generator.nextInt(10)+1;
		System.out.println(num1);

		//1~16
		num1 = generator.nextInt(16)+1;
		System.out.println(num1);
		
		//20~25
		//0~5 + 20
		num1 = generator.nextInt(6)+20;
		System.out.println(num1);
		
		//-10~19
		num1 = generator.nextInt(30)-10;
		System.out.println(num1);
		
		double num2;
		//0.0 ~ 1.0¹Ì¸¸
		num2 = generator.nextFloat();
		System.out.println(num2);
		
		num2 = generator.nextFloat()*6;
		num1 = (int)num2+1;
		System.out.println(num1);
	}

}
