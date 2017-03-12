package com.inter1;
/*
인터페이스 Marker기능
 - 무엇인가를 표시(클래스의 특성을 표시)하는 용으로 인터페이스 사용(마커, 표시하는 역할)
 - 인터페이스 이름을 ~able로 끝나게 정의합니다.
 - 인터페이스 내부는 비어있는 형태를 가질 수 있다


*/

interface UpperCasePrintable{	//인터페이스 이름을 ~able로 끝나게 정의합니다.
	
}

class NamePrinter {
	public static void print(Object obj) {
		String str = obj.toString();
		
		if(obj instanceof UpperCasePrintable){
			str = str.toUpperCase();
		}
		System.out.println(str);
	}
}

class NameOne implements UpperCasePrintable {
	private String name;
	
	NameOne(String name){
		this.name = name;
	}
	
	@Override
	public String toString(){
		String strName = "Your name is " + name;
		return strName;
	}
}

class NameTwo {
	
	private String name;
	
	NameTwo(String name){
		this.name = name;
	}
	
	@Override
	public String toString(){
		String strName = "Your name is " + name;
		return strName;
	}
}

public class InterfaceEx05 {

	public static void main(String[] args) {
		
		NameOne name1 = new NameOne("steve");
		NameTwo name2 = new NameTwo("jessica");
		NameOne name3 = new NameOne("alice");
		NameTwo name4 = new NameTwo("bob");
		
		NamePrinter.print(name1);
		NamePrinter.print(name2);
		NamePrinter.print(name3);
		NamePrinter.print(name4);

	}

}
