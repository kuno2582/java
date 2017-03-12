package com.america;
/*

데이터 객체(데이터 클래스)
 - 데이터를 담고 있는 클래스 (기능은 모두 배제)
 - 웹 프로그래밍에서는 자바빈(JavaBeans)
 - 저장된 데이터들은 private로 지정을 해서 정보은닉화를 시켜서 직접적으로 접근할 수 없도록하고
 	setter와 getter메소드를 통해서만 접근할 수 있게 해주는 클래스

*/
public class MyClass {

	private int number;
	
	public void setNumber(int num){
		number = num;
	}
	
	public int getNumber(){
		return number;
	}
	
}
