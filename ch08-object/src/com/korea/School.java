package com.korea;

/*

private		<	default		<	protected	<	public
클래스 내부		<	동일패키지		<	상속 클래스		<	모두 다

*/

class Human {	//부모클래스
	protected String name;
	protected int age;
	
}

// 상속은 특정 클래스가 가지고 있는 속성과 기능을 다른 새로운 
// 클래스에 제공하기 위해 맺는 클래스들간의 관계
class Teacher extends Human {	//자식클래스
	
	public void setAge(int num){
		age = num;
	}
	
	public void getAge(){
		System.out.println(age);
	}
	
}

public class School {

	public static void main(String[] args) {
		
		Teacher t = new Teacher();
		t.setAge(45);
		t.getAge();

	}

}
