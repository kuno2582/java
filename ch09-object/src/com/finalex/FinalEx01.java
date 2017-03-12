package com.finalex;
/*

final
 - 더 이상의 확장이 불가능함을 알리는 종단을 의미합니다.
 - 변수에 final을 붙여 상수화되어져서 변경시에 컴파일 에러가 발생하게 됩니다.
 
final 적용
 - 변수에 final -> 상수			
 - final 자료형 변수명

 - 메소드에 final -> 오버라이딩이 불가능
 - 접근제한자 final 반환형 메소드명(){}
 
 - 클래스에 final -> 더 이상의 상속 불가능
 - 접근제한자 final class 클래스명{}


*/
public class FinalEx01 {
	
	int var1 = 100;
	
	final int var2 = 300;
	
	public static final int VAR3 = 400;

	public static void main(String[] args) {
		
		FinalEx01 f1 = new FinalEx01();
		System.out.println("f1.var 변경 전 값: " + f1.var1);
		
		f1.var1 = 200;
		System.out.println("f1.var 변경 후 값: " + f1.var1);
		
		System.out.println(f1.var2);
		//f1.var2 = 500;

		System.out.println(FinalEx01.VAR3);
		System.out.println(VAR3);
		
		final int NUM = 500;
		System.out.print(NUM);
		
	}

}
