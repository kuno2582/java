package com.inner2;
/*

NestedClass (중첩클래스)
 - 클래스 안에 클래스가 선언되는 것

*/
class OuterClass {
	
	OuterClass(){
		NestedClass nc = new NestedClass();	//외부클래스가 생성되면 자동으로 내부클래스 생성
		nc.getData();
	}
	
	static class NestedClass{
		
		public void getData(){
			System.out.println("Nested Instance Method");
		}
	}
	
}

public class StaticEx02 {

	public static void main(String[] args) {
		
		OuterClass ot = new OuterClass();
		
		OuterClass.NestedClass ocnc = new OuterClass.NestedClass();
		//OuterClass.NestedClass ocnc = ot.new NestedClass();
		ocnc.getData();
		
		System.out.println(ot);
		
//		OuterClass.NestedClass ocnc2 = ot.new NestedClass(); 이렇게는 불가하다
		

	}

}
