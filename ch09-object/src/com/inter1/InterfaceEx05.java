package com.inter1;
/*
�������̽� Marker���
 - �����ΰ��� ǥ��(Ŭ������ Ư���� ǥ��)�ϴ� ������ �������̽� ���(��Ŀ, ǥ���ϴ� ����)
 - �������̽� �̸��� ~able�� ������ �����մϴ�.
 - �������̽� ���δ� ����ִ� ���¸� ���� �� �ִ�


*/

interface UpperCasePrintable{	//�������̽� �̸��� ~able�� ������ �����մϴ�.
	
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
