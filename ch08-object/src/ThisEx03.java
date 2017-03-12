/*

this()
 - 현재 객체의 생성자
 - 생성자의 첫 행에 정의해야 합니다. 

*/
public class ThisEx03 {
	
	public ThisEx03(){
		
		this("인자없는 생성자");
		
		System.out.println("생성자 호출전 수행문 호출");
		
	}
	
	public ThisEx03(String msg){	//위아래 생성자 모두 이 생성자를 거침
		System.out.println(msg);
	}
	
	public ThisEx03(int a){
		this(String.valueOf(a));
	}

	public static void main(String[] args) {
		
		ThisEx03 t = new ThisEx03();
		System.out.println(t);
		
		ThisEx03 t2 = new ThisEx03(1000);
		System.out.println(t2);
		
		ThisEx03 t3 = new ThisEx03("hahaha");
		System.out.println(t3);
		
	}

}
