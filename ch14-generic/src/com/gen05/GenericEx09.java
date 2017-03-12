package com.gen05;

class EmployeeInfo {
	public int position;
	
	EmployeeInfo(int position){
		this.position = position;
	}
}

class Person<T, S>{
	public T info;
	public S id;
	
	Person(T info, S id){
		this.info = info;
		this.id = id;
	}
	
	public <U> void printData(U info){
		System.out.println(info);
	}
	
}

public class GenericEx09 {

	public static void main(String[] args) {
		
		EmployeeInfo e1 = new EmployeeInfo(10);
		Integer id = new Integer(20);
		
		Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(e1,id);

		p1.<EmployeeInfo>printData(e1);
		
		p1.printData(e1);
	}

}
