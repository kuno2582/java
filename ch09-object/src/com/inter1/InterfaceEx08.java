package com.inter1;
/*

�������̽��� ���� ���� ���
Ŭ������ �������̽� ����
���߻��ȿ���� ���� �������̽��� �߻�޼ҵ带 �����ϴ� Ŭ���� ����
Ŭ���� ���, �������̽� ������ Ŭ������ �ν��Ͻ� ����
�ν��Ͻ��� ���� �޼ҵ� ȣ��

*/

class DMB {
	public void onDMB(){
		System.out.println("DMB ���");
	}
}

interface Mp3 {
	public void onMp3();
}

class Mp3Impl {
	public void onMp3(){
		System.out.println("Mp3 ���");
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
