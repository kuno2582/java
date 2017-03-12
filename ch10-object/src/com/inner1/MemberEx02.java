package com.inner1;

class Outer2 {
	
	int x = 100;
	
	class Inner2 {
		
		int y = 200;
		
		public void getData(){
			System.out.println("x: " + x);
			System.out.println("y: " + y);
		}
	}
	
}


public class MemberEx02 {

	public static void main(String[] args) {
		
		Outer2 ot2 = new Outer2();
		Outer2.Inner2 oi2 = ot2.new Inner2();
		
		Outer2.Inner2 oi22 = new Outer2().new Inner2();
		
		oi2.getData();
		oi22.getData();

	}

}
