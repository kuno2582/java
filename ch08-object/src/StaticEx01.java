/*

static
 - 멤버메소드와 멤버변수에 정의할때 사용
 - 지역변수와 클래스에는 정의할 수 없습니다.
 - 멤버메소드와 멤버변수에 static으로 정의를 하면
 	static메소드(클래스메소드), static변수(클래스변수)
 - 공유개념을 가지게 됩니다. 그래서 모든 객체들이 사용할 수 있게 됩니다.
 
접근제한자 static 자료형 변수명; static age (MyClass)
접근제한자 static 반환형 메소드명(자료형 인자1, ...){}
 
static 변수의 접근방법
 - 두가지 방법으로 접근이 가능
 - static변수에 대한 접근
 
인스턴스 이름을 이용한 접근방법
	MyClass mc = new MyClass();
	mc.age;
	
클래스 이름을 이용한 접근 방법(권장)
	MyClass.age;

*/
public class StaticEx01 {

	public static void main(String[] args) {
		
		StaticCount sc1 = new StaticCount();
		System.out.println("c: " + sc1.c + ", count: " + StaticCount.count);
//		System.out.println("sc1.count: " + sc1.count);
		
		StaticCount sc2 = new StaticCount();
		System.out.println("c: " + sc2.c + ", count: " + StaticCount.count);
//		System.out.println("sc2.count: " + sc2.count);
//		System.out.println("sc1.count: " + sc1.count);
		
	}

}
