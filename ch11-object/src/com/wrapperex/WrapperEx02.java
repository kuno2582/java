package com.wrapperex;
/*
Auto Boxing & Auto UnBoxing
Auto Boxing
 - 기본 자료형 데이터가 자동으로Wrapper인스턴스로 감싸지는 것
 - 기본 자료형 데이터가 와야 하는데, Wrapper인스턴스가 있다면, Auto Boxing 수행
 
Auto UnBoxing
 - Wrapper인스턴스에 저장된 데이터가 자동으로 꺼내지는 것
 - 인스턴스 와야 하는데, 기본 자료형 데이터가 있다면, Auto UnBoxing 수행


*/
public class WrapperEx02 {

	public static void main(String[] args) {
		
		Integer wrap_int = new Integer(10);
		int a = wrap_int + 10;	//Auto UnBoxing
		System.out.println(a);

		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer(120);
		int sum = obj1.intValue() + obj2.intValue();
		System.out.println("sum: " + sum);
		
		int result1 = obj1 * obj2;
		System.out.println(result1);
		
		Integer obj3 = 15;
		Integer obj4 = 20;
		
		Integer result2 = obj3 + obj4;	//언박싱 후 박싱
		System.out.println("result2: " + result2);
	}

}
