package com.object1;

public class ObjectClassEx03 {

	public static void main(String[] args) {
		
		ObjectClassEx03 ob1 = new ObjectClassEx03();
		
		System.out.println("ob1: " + ob1);
		
		ObjectClassEx03 ob2 = new ObjectClassEx03();
		
		System.out.println("ob2: " + ob2);
		
		if(ob1 == ob2)
			System.out.println("°°Àº °´Ã¼");
		else
			System.out.println("´Ù¸¥ °´Ã¼");
		
		
		if(ob1.equals(ob2))
			System.out.println("°°Àº °´Ã¼");
		else
			System.out.println("´Ù¸¥ °´Ã¼");

	}

}
