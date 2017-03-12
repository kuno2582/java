package com.object1;
/*

Object Class(오브젝트 클래스)
 - 모든 클래스의 최상위 클래스
 - extends 하지 않아도 자동으로 상속합니다.
 
 
인스턴스간의 내용 비교를 위한 메소드를 제공 -> equals()
 - ==연산자로 비교 -> 객체 == 객체 			레퍼런스를 비교하게 됨.(참조값 비교)
 - 인스턴스간 내용을 위해서 equals()를 재정의해서 사용해야 합니다.

public boolean equals(Object object){	//참조값 비교밖에 기능을 못함
	return (this == object);
}

*/

class IntNumber{
	int num;
	
	public IntNumber(int num){
		this.num = num;
	}
	
	public boolean isEquals(IntNumber numObj){
		if(this.num == numObj.num)
			return true;
		else
			return false;
	}
}

public class ObjectClassEx01 {

	public static void main(String[] args) {
		
		IntNumber num1 = new IntNumber(10);
		IntNumber num2 = new IntNumber(15);
		IntNumber num3 = new IntNumber(10);
		
		if(num1 == num2)
			System.out.println("num1 == num2");
		else if(num1 == num3){
			System.out.println("num1 == num3");
		}else{
			System.out.println("no match");
		}
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		if(num1.isEquals(num2)){
			System.out.println("num1과 num2는 같은 정수");
		}else{
			System.out.println("num1과 num2는 다른 정수");
		}
		
		if(num1.isEquals(num3)){
			System.out.println("num1과 num3는 같은 정수");
		}else{
			System.out.println("num1과 num3는 다른 정수");
		}

	}

}
