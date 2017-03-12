package com.inner2;

class OuterClassOne {
	
	OuterClassOne(){
		NestedClass nst = new NestedClass();
		nst.simpleMethod();
	}
	
	static class NestedClass {
		public void simpleMethod(){
			System.out.println("Nested Instance Method One");
		}
	}
	
}

class OuterClassTwo {
	
	OuterClassTwo(){
		NestedClass nst = new NestedClass();
		nst.simpleMethodTwo();
	}
	
	private static class NestedClass {
		public void simpleMethodTwo(){
			System.out.println("Nested Instance Method Two");
		}
	}
	
}

public class StaticEx03 {

	public static void main(String[] args) {
		
		OuterClassOne one = new OuterClassOne();
		OuterClassTwo two = new OuterClassTwo();
		
		OuterClassOne.NestedClass nst1 = new OuterClassOne.NestedClass();
		
//		OuterClassTwo.NestedClass nst2 = new OuterClassTwo.NestedClass(); 
		System.out.println(one);
		System.out.println(two);
		System.out.println(nst1);
	}

}
