package com.inner4;

class InnerParent2 {
	public void display(){
		System.out.println("부모클래스의 display");
	}
}

public class AnonymousEx02 {
	
	public void innerTest(){
		
		//구현부
		//정의부를 따로 정의하지 않고 구현부만 존재하기 때문에 구현부안의 정의부의 내용을
		//포함하고 있어야 한다. 익명클래스이기 때문에
		//이름이 없는 내부 클래스 생성할 때는 부모이름을 쓰거나 인터페이스명을 사용합니다.
		//반드시 객체생성을 바로 해주어야 한다. -구현부 특징
		//class Inner 해서 클래스 이름을 지정했던 것을 이름없이 사용합니다.
		//상속받은 클랫 InnerParent2를 통해 객체 생성해 줍니다.
		
		InnerParent2 i = new InnerParent2(){
			@Override
			public void display(){
				System.out.println("자식클래스의 display");
			}
		};
		i.display();
		
	}

	public static void main(String[] args) {
		
		AnonymousEx02 ame = new AnonymousEx02();
		ame.innerTest();

	}

}
