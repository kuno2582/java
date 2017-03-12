package com.gen08;
//���׸� ������ ����
/*
���׸��� �ڷ����� Ư������ ������ 
 - extends Object �ѰͰ� ������ �ǹ�
 - ObjectŬ������ �ڽ��̸� ��� �� �� �ֽ��ϴ�.
 - Object�� ������ �ִ� �޼ҵ带 ������ �޼ҵ�� ���׸����� ������ ��ü������ ȣ���� �� �����ϴ�.
 - ��, �ܼ��� Object�� �����̱� ������ Object�� ������ �ִ� �͸� ����� �� �ֽ��ϴ�.

*/
abstract class Info {
	public abstract int getInfo();
}

class EmployeeInfo extends Info {
	public int position;
	
	EmployeeInfo(int position){
		this.position = position;
	}
	
	@Override
	public int getInfo(){
		return this.position;
	}
}

class Person<T>{
	public T info;
	
	Person(T info){
		this.info = info;
		
		//info.getInfo(); ���׸��� ������ ���� �ʾ��� �� ������ �Ͼ ex11�� ��
	}
	
}

public class GenericEx12 {

	public static void main(String[] args) {
		
		Person<EmployeeInfo> p1 = new Person<EmployeeInfo>(new EmployeeInfo(10));
		System.out.println(p1);
		
		Person<String> p2 = new Person<String>("�հ�");
		System.out.println(p2);
	}

}
