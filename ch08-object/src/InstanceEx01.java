/*

객체(Object)
 - 인스턴스(instance)
 - 인스턴스는 클래스(청사진)를 통해서 만들어진 것
 - 객체는 자신만의 정보를 가지고 있는 독립적인 주제
 
객체 구성
객체 = 변수(상태, 속성, 데이터) + 메소드(동작, 기능, 행위, 방법, 방식)

클래스 구조
 - class키워드를 사용해서 정의합니다.
 
[지정자] class 클래스명{		//클래스 헤더
	변수 정의
	메소드 정의
	
	생성자 정의
}

클래스 헤더
 - 클래스 선언 부분
 - 클래스 키워드의 클래스명
 - class 키워드의 왼쪽에는 접근제한(지정자), 클래스형태, 클래스종류
 
[접근제한] [클래스종류] class [클래스명]


객체 생성
 - 클래스의 이름과 동일한 이름을 가진 생성자(함수)를 이용해서 객체를 생성하게 됩니다.
 - 이때 new 키워드와 함께 생성자함수를 호출하면 객체가 생성됩니다.
 
 클래스 객체명 = new 생성자();
 
 
 
 멤버 접근방법
 mc에는 생성된 객체의 참조값이 저장되어져 있습니다.
 mc 레퍼런스를 통해서 .(점)을 사용해서 해당 객체의 메소드나 변수에 접근할 수 있습니다.
 
 MyClass mc = new MyClass();
 mc.setName();
 
 System.out.println();

*/
public class InstanceEx01 {
	//클래스의 구성요소: 멤버필드(변수,상수), 멤버메소드, 생성자
	
	//멤버필드
	int var1;
	final int NUM_TWO=2;
	
	//생성자함수
	//객체 생성시 호출이되는 함수 , 객체를 생성시키고 멤버변수를 초기화하는 역할
	public InstanceEx01(){
		
	}
	
	//멤버메소드
	public int sum(int a, int b){
		return a+b;
	}
	
	public static void main(String[] args) {
		
		//객체 선언
		InstanceEx01 me1;
		InstanceEx01 me2;
		
		
		//객체 생성
		me1 = new InstanceEx01();
		me2 = new InstanceEx01();
		
		System.out.println(me1);
		System.out.println(me2);
		
		System.out.println(me1.var1);	//기본값으로 자동 초기화되어있음
		System.out.println(me1.NUM_TWO);
		
		me1.var1 = 10;
		
		System.out.println(me1.var1);
		System.out.println(me2.var1);
		
//		me1.NUM_TWO = 20;
		
		int result = me1.sum(20, 40);
		System.out.println(result);

	}

}
