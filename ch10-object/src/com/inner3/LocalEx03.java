package com.inner3;

public class LocalEx03 {
	
	int a = 300;
	
	public void innerTest(int k){
		
		final int b= 200;	//버전에 따라 final 안붙여줄 경우 오류가 날 수 있음
		
		final int c = k;
		
		class Inner {
			
			public void getData(){
				
				//외부클래스의 멤버변수 호출
				System.out.println("int a: " + a);
				
				//Local 내부클래스를 포함하고 있는 메소드의 지역변수 호출
				//Local 내부클래스는 지역변수를 사용할 수 있습니다.
				System.out.println("int b: " + b);
				
				System.out.println("final int c: " + c);
			}
		}
		
		Inner in = new Inner();
		in.getData();
		
	}

	public static void main(String[] args) {
		
		LocalEx03 lo = new LocalEx03();
		lo.innerTest(1000);

	}

}
