package com.korea;

/*

private		<	default		<	protected	<	public
Ŭ���� ����		<	������Ű��		<	��� Ŭ����		<	��� ��

*/

class Human {	//�θ�Ŭ����
	protected String name;
	protected int age;
	
}

// ����� Ư�� Ŭ������ ������ �ִ� �Ӽ��� ����� �ٸ� ���ο� 
// Ŭ������ �����ϱ� ���� �δ� Ŭ�����鰣�� ����
class Teacher extends Human {	//�ڽ�Ŭ����
	
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
