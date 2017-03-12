package com.inter1;

interface A3 {
	
	public static final int W = 10;
	int X = 20;
	static final int Y = 30;
	final int Z = 40;
	int V = 50;		//자동으로 모두 다 static final로 정의됨
	
	
}

public class InterfaceEx03 {

	public static void main(String[] args) {
		
		//A3 a3 = new A3(); 인터페이스는 객체화하기 위한게 아님
		
		System.out.println("W: " + A3.W + ", Y: " + A3.Y);
		System.out.println("X: " + A3.X + ", V: " + A3.V);
		System.out.println("Z: " + A3.Z);
		
//		A3.W = 100; 상수이기 때문에 변경 안됨

	}

}
