/*

접근 지정자(Access modifier)
 - 접근제한자, 접근한정자
 - 멤버들은 객체 자신만의 속성, 특성이므로 대외적으로 공개하면 안될 때가 있습니다.
 - 비공개로 하기 위해서 객체의 멤버들에게 접근제한자를 걸어줄 수 있습니다.
 - 감추고 싶은것은 감추고 보여주고 싶은 것은 보여주게 할 수 있습니다.
 
 
private		<	default		<	protected	<	public
클래스 내부		<	동일패키지		<	상속 클래스		<	모두 다

*/
package com.america;



public class Student {

	public static void main(String[] args) {

		com.korea.Student instance = new com.korea.Student();
		instance.getMessage();
		
		Student student = new Student();
		student.getMessage();
	}
	
	void getMessage(){
		System.out.println("American Student");
	}

}
