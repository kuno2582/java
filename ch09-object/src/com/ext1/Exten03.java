/*

상속 - 문법
 - 기존에 정의된 클래스에 메소드와 변수를 추가하여 새로운 클래스를 정의해주는 것
 - extends 
 
 
상속에서 인스턴스 생성
 - 하위클래스의 생성자는 상위클래스의 멤버변수를 초기화할 데이터까지 모두 인자로 
 	전달 받아야 합니다.
 - 상위클래스의 생성자호출(super())은 하위클래스의 멤버변수 초기화보다 먼저 수행되어야 합니다.
 - 하위클래스의 생성자는 상위클래스의 생성자 호출을 통해서 상위클래스의 멤버변수를 초기화해야 합니다.
 - super()은 상위클래스의 생성자 호출할 때 사용
 - super()와 함께 전달되는 인자의 수와 자료형은 호출할 생성자가 실행될 때 결정

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
		super(name);			//항상 첫번째(첫라인)에 호출되어야한다.
		this.company = company;
		this.position = position;
	}
	
	public void showInfo(){
		showName();		//메소드를 통한 상속 변수,메소드접근은 가능함
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
	}
}



