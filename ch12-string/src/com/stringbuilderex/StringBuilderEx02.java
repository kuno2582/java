package com.stringbuilderex;

class Adder {
	private int num;
	
	public Adder(){
		num = 0;
	}
	
	public Adder add(int num){
		this.num += num;
		
		return this;	//자신의 참조값 반환
	}
	
	public void showResult(){
		System.out.println("Result: " + num);
	}
	
}

public class StringBuilderEx02 {

	public static void main(String[] args) {
		
		Adder a1 = new Adder();
		a1.add(8).add(10).showResult();

	}

}
