package com.wrapperex;

class IntWrapper {
	private int num;
	
	public IntWrapper(int data){
		num = data;
	}
	
	@Override
	public String toString(){
		return "" + num;	//객체 참조명으로 출력
	}
}


public class WrapperEx03 {
	
	public static void showData(Object obj){
		System.out.println(obj);
	}

	public static void main(String[] args) {
		
		IntWrapper intInstance = new IntWrapper(3);
		
		Integer basicInstance = new Integer(10);
		
		showData(intInstance);
		showData(basicInstance);
		showData(new IntWrapper(7));
		
		Integer num1 = new Integer("300");
		Integer num2 = new Integer("200");
		
		System.out.println("num1 : " + num1);
		System.out.println("num1 + num2 = " + (num1 + num2));
		
	}

}
