package com.gen02;
/*
���׸��� ����
- �����ϴܰ迡�� ���� ����
- ��ü ������ T�� �ڷ����� ��ġ���� ������ ������ ������ �߻��ϹǷ� 
   �ڷ����� ���ݴ� �����մϴ�.
- �ߺ� ���ſ� Ÿ�� �������� ���ÿ� �߱��� �� �ֽ��ϴ�.

*/
class StudenInfo{
	public int grade;
	StudenInfo(int grade){
		this.grade = grade;
	}
}

class EmployeeInfo{
	public int position;
	EmployeeInfo(int position){
		this.position = position;
	}
}

class Person<Z>{
	public Z info;
	
	Person(Z info){
		this.info = info;
	}
}


public class GenericEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person<String> p1 = new Person<String>("����");
		String ei = p1.info;
		System.out.println(ei);
//		System.out.println(ei.position);
		
//		StudenInfo sii = p1.info;
//		System.out.println(sii.grade);
		
		
		Person<StudenInfo> p2 = new Person<StudenInfo>(
				new StudenInfo(20));
		StudenInfo si = p2.info;
		System.out.println(si.grade);
		
	}

}
