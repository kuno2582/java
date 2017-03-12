/*

정보은닉(Information Hiding)
 - 정보에 직접 접근하는 것을 허용하지 않는 것
 - 클래스 안에 있는 정보를 보이지 않도록 감싸는 것
 - 객체간에 약속되지 않은 부분을 숨기게 됩니다.
 
  
은닉성(Encapsulation)
 - 최소한의 기능만을 노출하고 내부는 모두 감추는 것
 - 상속과 다형성과 함께 OOP(객체지향프로그래밍)의 3대 특징
 
private 멤버변수;

public 메소드;

*/

class Capsule {
	
	private int a;
	
	public void setA(int n){
		
		if(n >= 0)
			a = n;
		else
			System.out.println("음수는 허용되지 않습니다.");
	}
	
	public int getA(){
		return a;
	}
}

public class CapsuleMain {
	
	private int a;
	
	public void setA(int n){
		a = n;
	}
	
	public int getA(){
		return a;
	}
	
	public static void main(String[] args){
		
		CapsuleMain csm = new CapsuleMain();
		csm.a = 10;
		System.out.println(csm.a);
		csm.a = -10;
		System.out.println(csm.a);
		
		Capsule cs = new Capsule();
		cs.setA(12);
		System.out.println(cs.getA());
		cs.setA(-12);
		System.out.println(cs.getA());
		
	}

}
