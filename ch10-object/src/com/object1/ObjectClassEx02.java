package com.object1;
/*
equals () 메소드
 - 객체의 인스턴스 값 비교
 - 객체 비교시 실제값을 비교하지 않고 위치값을 비교
 - 실제값을 비교하기 위해서는 equals메소드를 오버라이딩(재정의)해서 사용해야합니다.
 

*/

class IntNumber2 {
	int num;
	
	public IntNumber2(int num){
		this.num = num;
	}
	
	@Override
	public boolean equals(Object obj){
		if(this.num == ((IntNumber2)obj).num){
			return true;
		}else{
			return false;
		}
		
	}
}

public class ObjectClassEx02 {

	public static void main(String[] args) {
		
		IntNumber2 num1 = new IntNumber2(10);
		IntNumber2 num2 = new IntNumber2(15);
		IntNumber2 num3 = new IntNumber2(10);
		
		if(num1.equals(num2))
			System.out.println("num1과 num2는 같은 정수");
		else
			System.out.println("num1과 num2는 다른 정수");
		
		if(num1.equals(num3))	//객체 참조값 비교이기 때문에 원하는대로 나오지 않음
			System.out.println("num1과 num3는 같은 정수");
		else
			System.out.println("num1과 num3는 다른 정수");

	}

}
