package com.finalex;
/*
 (사용예)
 - JAVA API
 - JAVa 기본클래스는 상속 안 되도록 final로 정의 되어져 있습니다.
 - 원형 그대로 사용하게 하기 위해서입니다.


*/
final class Parent {
	int a = 100;
}

//public class FinalEx03 extends Parent {
public class FinalEx03 {

	public static void main(String[] args) {
		
		FinalEx03 finalEx = new FinalEx03();
		System.out.println(finalEx);

	}

}
