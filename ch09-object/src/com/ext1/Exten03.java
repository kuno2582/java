/*

��� - ����
 - ������ ���ǵ� Ŭ������ �޼ҵ�� ������ �߰��Ͽ� ���ο� Ŭ������ �������ִ� ��
 - extends 
 
 
��ӿ��� �ν��Ͻ� ����
 - ����Ŭ������ �����ڴ� ����Ŭ������ ��������� �ʱ�ȭ�� �����ͱ��� ��� ���ڷ� 
 	���� �޾ƾ� �մϴ�.
 - ����Ŭ������ ������ȣ��(super())�� ����Ŭ������ ������� �ʱ�ȭ���� ���� ����Ǿ�� �մϴ�.
 - ����Ŭ������ �����ڴ� ����Ŭ������ ������ ȣ���� ���ؼ� ����Ŭ������ ��������� �ʱ�ȭ�ؾ� �մϴ�.
 - super()�� ����Ŭ������ ������ ȣ���� �� ���
 - super()�� �Բ� ���޵Ǵ� ������ ���� �ڷ����� ȣ���� �����ڰ� ����� �� ����

*/
package com.ext1;

public class Exten03 {

	public static void main(String[] args) {
		
		Employee man1 = new Employee("mark","Google","Salesman");
		man1.showInfo();
		
		Employee man2 = new Employee("Nicolas","Facebook","Manager");
		man2.showInfo();
		
	}

}

class Person {
	String name;
	
	public Person(String name){
		this.name = name;
	}
	
	public void showName(){
		System.out.println("My name is " + name);
	}
}

class Employee extends Person {
	String company;
	String position;
	
	public Employee(String name, String company, String position){
		super(name);			//�׻� ù��°(ù����)�� ȣ��Ǿ���Ѵ�.
		this.company = company;
		this.position = position;
	}
	
	public void showInfo(){
		showName();		//�޼ҵ带 ���� ��� ����,�޼ҵ������� ������
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
	}
}



