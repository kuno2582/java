package com.ext3;

class Parent {
	
	String msg = "Parent Ŭ����";
	public String getMessage(){
		return msg;
	}
}

class Child extends Parent{
	
	String msg = "Child Ŭ����";
	
	@Override
	public String getMessage(){
		return msg;
	}
	
}

public class OverridingEx02 {

	public static void main(String[] args) {
		
		Child c = new Child();
		System.out.println(c.getMessage());
		
		Parent p = new Child();
		System.out.println(p.getMessage());
		//���������� �ڷ����� ������� �������̵��� �޼ҵ�� �ܺηκ��� ����������.
		//���������� �������̵��� �޼ҵ尡 ȣ��ǰ� �ȴ�.

	}

}
