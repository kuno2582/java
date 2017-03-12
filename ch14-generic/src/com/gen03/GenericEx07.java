package com.gen03;
/*
복수의 제네릭
- 클래스내에서 여러개의 제네릭이 필요할 경우
- ,로 구분
- 제네릭 명칭은 고정된 것은 없지만 중복되지 않게는 사용해야 합니다.
- 관습적으로 T이후의 대문자로 지정하고 있습니다.


<T>	자료형(Type)
<E>	요소(Element)
<K>	Key값
<V> Value값
*/
class EmployeeInfo{
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
}



public class GenericEx07 {

	public static void main(String[] args) {		
		
		Person<EmployeeInfo, Integer> p1 = 
				new Person<EmployeeInfo, Integer>(
						new EmployeeInfo(10), 
						20
						);
		System.out.println("position: " + p1.info.position 
				+ " , id: " + p1.id);

	}

}
