package com.abs1;
/*

추상클래스의 상속관계
 - 추상클래스들간에도 상속이 가능합니다. 
 - 추상클래스들간의 상속에서는 상속받은 추상 메소드들을 꼭 재정의 할 필요는 없습니다.

*/

abstract class AbsEx1 {
	
	int a = 2016;
	final String str = "abstract test";
	
	public String getStr(){
		return str;
	}
	
	public abstract int getA();
}

abstract class AbsEx2 extends AbsEx1{
	
	@Override
	public int getA(){
		return a;
	}
	
	public abstract String getStr();
}

public class AbstractEx02 extends AbsEx2 {
	
	@Override
	public String getStr(){
		return str;
	}

	public static void main(String[] args) {
		
		AbstractEx02 ae = new AbstractEx02();
		
		System.out.println(ae.getA());
		System.out.println(ae.getStr());

	}

}
