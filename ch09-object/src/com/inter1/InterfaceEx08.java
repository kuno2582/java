package com.inter1;
/*

인터페이스를 통한 다중 상속
클래스와 인터페이스 정의
다중상속효과를 위한 인터페이스와 추상메소드를 구현하는 클래스 생성
클래스 상속, 인터페이스 구현한 클래스의 인스턴스 생성
인스턴스를 통해 메소드 호출

*/

class DMB {
	public void onDMB(){
		System.out.println("DMB 출력");
	}
}

interface Mp3 {
	public void onMp3();
}

class Mp3Impl {
	public void onMp3(){
		System.out.println("Mp3 재생");
	}
}

class SmartPhone extends DMB implements Mp3 {
	
	Mp3Impl mp3 = new Mp3Impl();
	
	@Override
	public void onMp3(){
		mp3.onMp3();
	}
	
	public void powerOn(){
		onDMB();
		onMp3();
	}
}

public class InterfaceEx08 {

	public static void main(String[] args) {
		
		SmartPhone smartPhone = new SmartPhone();
		
		smartPhone.powerOn();
		
		DMB dmb = smartPhone;
		Mp3 mp3 = smartPhone;
		
		dmb.onDMB();
		mp3.onMp3();
		
		
	}

}
