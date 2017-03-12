package com.gen06;
/*

���׸��� ����
 - extendsŰ����� ���׸����� �ü� �ִ� ������Ÿ���� Ư�� Ŭ������ �ڽ����� ������ �� �ֽ��ϴ�.
 - extends�� ���� �θ�Ŭ������ �������� �����ؼ� ���׸����� �� �� �ִ� �� Ÿ���� �����ϰ� �˴ϴ�.
 - extends�� ��ӻ� �ƴ϶� ������ ���迡���� ����� �� �ֽ��ϴ�.
 
 class Ŭ������<T extends �θ�Ŭ����>{
 
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

class Person<T extends Info>{	//infoŬ�����̰ų� infoŬ������ �ڽĵ鸸 �� �� �ִ�.
	public T info;
	
	Person(T info){
		this.info = info;
	}
}

public class GenericEx10 {

	public static void main(String[] args) {
		
		Person<EmployeeInfo> p1 = new Person<EmployeeInfo>(new EmployeeInfo(10));
		System.out.println(p1);
		
		//Person<String> p2 = new Person<String>("CEO"); info�� �ڽ��� �ƴϱ⿡ ����

	}

}
