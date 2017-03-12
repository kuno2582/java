package com.gen07;

interface Info {
	int getInfo();
}

class EmployeeInfo implements Info {
	
	public int position;
	
	EmployeeInfo(int position){
		this.position = position;
	}
	
	@Override
	public int getInfo(){
		return this.position;
	}
	
}

class Person<T extends Info>{
	public T info;
	
	Person(T info){
		this.info = info; 
		info.getInfo();
	}
}

public class GenericEx11 {

	public static void main(String[] args) {
		
		Person<EmployeeInfo> p1 = new Person<EmployeeInfo>(new EmployeeInfo(10));
		System.out.println(p1.info.getInfo());
		
		//Generic 제한에 위배되도록 지정
		//Person<String> p2 = new Person<String>("합격");

	}

}
