/*

메소드 오버로딩
기능이 같은 메소드를 여러개 만들 때 사용

메소드 오버로딩 규칙
 - 메소드명은 같고 인자의 타입은 다르게 명시
 - 타입이 같으면 인자의 개수를 다르게 명시
 - 타입과 개수가 같으면 순서를 다르게 명시
 
오버로딩의 목적
 - 재사용성을 높여주기 위해서
 - 같은 목적으로 비슷한 동작을 수행하는 메소드들을 모아서 이름을 같게 해서 사용하기 위해서
 - 프로그래머가 다양한 메소드들을 호출할 때 같은 이름으로 호출할 수 있게 해줍니다.
  	(일관된 작업을 할 수 있도록 편의를 제공)
 

*/
public class OverloadingEx03 {

	public void getLength(String str){
		System.out.println("입력한 값 \""+str+"\" 의 길이: " + str.length());
	}
	
	public void getLength(int n){
		String s = String.valueOf(n);
		getLength(s);
	}
	
	public void getLength(float f){
		String s = String.valueOf(f);
		getLength(s);
	}
	
	public void getLength(float f, int a){
		String s = String.valueOf(f) + String.valueOf(a);
		getLength(s);
	}
	
	public void getLength(int a, float f){
		String s = String.valueOf(a) + String.valueOf(f);
		getLength(s);
	}
	
	public void getLength(String str, float f){
		String s = str + String.valueOf(f);
		getLength(s);
	}
	
	public void getLength(float f, String str){
		String s = String.valueOf(f) + str;
		getLength(s);
	}
	
	public void getLength(int n, float f, String str){
		String s = String.valueOf(n) + String.valueOf(f) + str;
		getLength(s);
	}
	
	
	public static void main(String[] args) {
		
		OverloadingEx03 oe = new OverloadingEx03();
		
		oe.getLength(1000);
		oe.getLength(10.2541f);
		oe.getLength("대한민국");
		oe.getLength(1000, 10.2541f);
		oe.getLength(10.2541f, 5000);
		oe.getLength("대한민국", 10.2541f);
		oe.getLength(10.2541f, "대한민국");

	}

}
