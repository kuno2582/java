package com.gen03;
/*
������ ���׸�
- Ŭ���������� �������� ���׸��� �ʿ��� ���
- ,�� ����
- ���׸� ��Ī�� ������ ���� ������ �ߺ����� �ʰԴ� ����ؾ� �մϴ�.
- ���������� T������ �빮�ڷ� �����ϰ� �ֽ��ϴ�.


<T>	�ڷ���(Type)
<E>	���(Element)
<K>	Key��
<V> Value��
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
