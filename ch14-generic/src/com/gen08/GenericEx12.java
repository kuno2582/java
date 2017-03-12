package com.gen08;
//제네릭 제한의 생략
/*
제네릭의 자료형을 특정하지 않으면 
 - extends Object 한것과 동일한 의미
 - Object클래스의 자식이면 모두 볼 수 있습니다.
 - Object가 가지고 있는 메소드를 제외한 메소드는 제네릭으로 선언한 객체에서는 호출할 수 없습니다.
 - 즉, 단순한 Object인 상태이기 때문에 Object가 가지고 있는 것만 사용할 수 있습니다.

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
		
		//info.getInfo(); 제네릭에 제한을 두지 않았을 때 오류가 일어남 ex11과 비교
	}
	
}

public class GenericEx12 {

	public static void main(String[] args) {
		
		Person<EmployeeInfo> p1 = new Person<EmployeeInfo>(new EmployeeInfo(10));
		System.out.println(p1);
		
		Person<String> p2 = new Person<String>("합격");
		System.out.println(p2);
	}

}
