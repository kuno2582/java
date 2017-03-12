package com.calculator;

public class User {

	public static void main(String[] args) {
		
		Calculator calcu = new Calculator();
		
		System.out.println(calcu.add(10,7));
		System.out.println(calcu.divide(10,7));
		System.out.println(calcu.times(10,7));
		System.out.println(calcu.substract(10,7));

	}

}
