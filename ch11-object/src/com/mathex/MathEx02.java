package com.mathex;

public class MathEx02 {

	public static void main(String[] args) {
		
		System.out.println("¿øÁÖÀ²: " + Math.PI);
		System.out.println("2ÀÇ Á¦°ö±Ù: " + Math.sqrt(2));
		System.out.println("ÆÄÀÌ¿¡ ´ëÇÑ Degree: " + Math.toDegrees(Math.PI));
		System.out.println();
		
		double radian = Math.toRadians(43);
		System.out.println("½ÎÀÎ 43: " + Math.sin(radian));
		System.out.println("½ÎÀÎ 43: " + Math.cos(radian));
		System.out.println("½ÎÀÎ 43: " + Math.tan(radian));

	}

}
