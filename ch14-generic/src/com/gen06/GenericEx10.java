package com.gen06;
/*

제네릭의 제한
 - extends키워드로 제네릭으로 올수 있는 데이터타입을 특정 클래스의 자식으로 제한할 수 있습니다.
 - extends를 통해 부모클래스가 무엇인지 지정해서 제네릭으로 올 수 있는 그 타입을 제한하게 됩니다.
 - extends는 상속뿐 아니라 구현의 관계에서도 사용할 수 있습니다.
 
 class 클래스명<T extends 부모클래스>{
 
 }
 
 class Person<T extends Info>{
 
 }

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
		return position;
	}
}

class Person<T extends Info>{	//info클래스이거나 info클래스의 자식들만 올 수 있다.
	public T info;
	
	Person(T info){
		this.info = info;
	}
}

public class GenericEx10 {

	public static void main(String[] args) {
		
		Person<EmployeeInfo> p1 = new Person<EmployeeInfo>(new EmployeeInfo(10));
		System.out.println(p1);
		
		//Person<String> p2 = new Person<String>("CEO"); info의 자식이 아니기에 못옴

	}

}
