/*

생성자(Constructor)
 - 객체가 생성될 때 자동적으로 단 한번 호출
 - 객체의 구조를 만들어주는 역할
 - 생성되는 객체의 멤버변수들을 초기화하는 역할
 
 
생성자 조건
 - 생성자의 이름은 클래스명과 같아야 합니다.
 - return 타입이 정의되지 않습니다. 반환하지 않는 메소드
 - 객체 생성시 생성자는 반드시 호출되어집니다. 
 - final상수의 초기화 기능
 
class 클래스명{

	[접근제한자] 클래스명(자료형 인자1, 자료형 인자2){
		수행문1;
		수행문2;
	}
	
}



public class ObjectEx02 {

	public static void main(String[] args) {
		
		Number myNumber1 = new Number();
		Number myNumber2 = new Number();
		
		System.out.println("myNumber1의 메소드 호출 전 값: " + myNumber1.getNum());
		System.out.println("myNumber2의 메소드 호출 전 값: " + myNumber2.getNum());
		
		instMethod(myNumber1);
		instMethod(myNumber2);
		
		System.out.println("myNumber1의 메소드 호출 후 값: " + myNumber1.getNum());
		System.out.println("myNumber2의 메소드 호출 후 값: " + myNumber2.getNum());

	}
	public static void instMethod(Number number){
		number.addNum(10);
	}
}

class Number{
	int num;
	
	public Number(){
		num = 30;
		System.out.println("생성자 호출");
	}
	
	public void addNum(int n){
		num += n;
	}
	
	public int getNum(){
		return num;
	}
}



*/