package com.ext3;
/*

오버라이딩(Overriding) 			vs 	오버로딩(Overloading)

재정의(덮어쓰기)						다중정의		

상속관계								특정클래스

super클래스메소드보다					상관없음
sub클래스의 메소드 접근제한이 동일하거나 
더 넓어야합니다.

반환형 같아야합니다.						상관없음

메소드명 똑같아야한다.					메소드명 똑같아야한다.

인자 같아야한다.							달라야한다.

*/

class AClass {
	
	public void rideMethod(){
		System.out.println("AClass's Method");
	}
	
	public void loadMethod(){
		System.out.println("void Method");
	}
	
}

class BClass extends AClass{
	
	@Override
	public void rideMethod(){
		System.out.println("BClass's Method");
	}
	
	public void loadMethod(int num){
		System.out.println("int Method");
	}
}

class CClass extends BClass{
	
	@Override
	public void rideMethod(){
		System.out.println("CClass's Method");
	}
	
	public void loadMethod(double num){
		System.out.println("double Method");
	}
	
}

public class OverridingEx03 {

	public static void main(String[] args) {
		
		AClass ref1 = new CClass();
		BClass ref2 = new CClass();
		CClass ref3 = new CClass();
		
		ref1.rideMethod();
		ref2.rideMethod();
		ref3.rideMethod();

		ref3.loadMethod();
		ref3.loadMethod(1);
		ref3.loadMethod(1.1);
	}

}
