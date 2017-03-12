package com.gen02;
/*
제네릭의 이점
- 컴파일단계에서 오류 점검
- 객체 생성시 T의 자료형에 일치하지 않으면 컴파일 에러가 발생하므로 
   자료형에 조금더 안전합니다.
- 중복 제거와 타입 안전성을 동시에 추구할 수 있습니다.

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
		
		Person<String> p1 = new Person<String>("사장");
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
