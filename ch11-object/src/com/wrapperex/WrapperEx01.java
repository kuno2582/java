package com.wrapperex;
/*
Wrapper 클래스(래퍼 클래스)
 - 기본 자료형 데이터를 인스턴스화 해야하는 상황에서 사용할 수 있는 클래스
 - 기본 자료형을 참조자료형으로 변환할때 사용하는 클래스
 - 기본 데이터 타입을 마치 객체인 것처럼 만들어주는 클래스
 
기본 자료형			Wrapper클래스
boolean			Boolean
char			Character
byte			Byte
short			Short
int				Integer
long			Long
float			Float
double			Double


Wrapper클래스의 Boxing & UnBoxing
Boxing			기본자료형 -> 참조자료형
				기본자료형 데이터를 Wrapper 인스턴스로 감싸는 것
				
UnBoxing		참조자료형 -> 기본자료형
				Wrapper 인스턴스에 저장된 데이터를 꺼내는 것



*/
public class WrapperEx01 {

	public static void main(String[] args) {
		
		boolean b = true;
		Boolean wrap_boolean = new Boolean(b);
		
		System.out.println("b: " + b);
		System.out.println("wrap_boolean: " + wrap_boolean.booleanValue());	//객체안에 있는 boolean값을 원래 자료형으로 리턴

		Integer wrap_integer = new Integer(100);
		int i = wrap_integer.intValue();
		System.out.println("i: " + i);
		System.out.println("wrap_integer: " + wrap_integer);
		
	}

}
