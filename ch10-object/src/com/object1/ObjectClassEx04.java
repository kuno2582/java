package com.object1;

public class ObjectClassEx04 {

	public static void main(String[] args) {
		
		ObjectClassEx04 ob = new ObjectClassEx04();
		
		System.out.println("ob: " + ob);	//자동으로 toString()붙음
		
		System.out.println("toString(): " + ob.toString()); //16진수로 출력
		
		System.out.println("getClass(): " + ob.getClass()); //클래스 가져오기
		
		System.out.println("hashCode(): " + ob.hashCode());

	}

}
