package com.inter1;

interface Inter9 {
	public abstract void play();
}

public class InterfaceEx09 implements Inter9 {
	
	@Override
	public void play(){
		System.out.println("play �޼ҵ�");
	}
	
	public void study(){
		System.out.println("study �޼ҵ�");
	}

	public static void main(String[] args) {
		
		InterfaceEx09 ife = new InterfaceEx09();
		ife.play();
		ife.study();
		
		//Ŭ����Ÿ�� -> �������̽�Ÿ�� (�ڵ� ����ȯ)
		Inter9 if9 = ife;
		if9.play();

	}

}
