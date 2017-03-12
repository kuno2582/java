package com.mathex;

public class MathEx03 {

	public static void main(String[] args) {
		
		double a = 100.123456;
		
		double d = Math.round(a);
		System.out.println(d);
		
		d = Math.round(a*100d)/100d;
		System.out.println(d);
		
		d = Math.round(a*1000d)/1000d;
		System.out.println(d);

	}

}
