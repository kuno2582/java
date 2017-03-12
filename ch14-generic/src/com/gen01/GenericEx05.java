package com.gen01;

class StudenInfo{
	public int grade;
	StudenInfo(int grade){
		this.grade = grade;
	}
}

class EmployeeInfo{
	public int position;
	EmployeeInfo(int position){
		this.position = position;
	}
}

class Person{
	public Object info;
	
	Person(Object info){
		this.info = info;
	}
}


public class GenericEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person("ªÁ¿Â");
		
		EmployeeInfo ei = (EmployeeInfo)p1.info;
		
		System.out.println(ei.position);

	}
}
