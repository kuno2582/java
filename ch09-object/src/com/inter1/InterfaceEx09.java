package com.inter1;

interface Inter9 {
	public abstract void play();
}

public class InterfaceEx09 implements Inter9 {
	
	@Override
	public void play(){
		System.out.println("play 메소드");
	}
	
	public void study(){
		System.out.println("study 메소드");
	}

	public static void main(String[] args) {
		
		InterfaceEx09 ife = new InterfaceEx09();
		ife.play();
		ife.study();
		
		//클래스타입 -> 인터페이스타입 (자동 형변환)
		Inter9 if9 = ife;
		if9.play();

	}

}
