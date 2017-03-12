/*

캡슐화(Encapsulation)
 - 내부의 동작 방법을 숨기고 사용자에게는 사용 방법만 알려주는 것
 - 관련이 있는 데이터 또는 동작(기능)들을 하나로 묶어주는 역할
 - 사용자에게는 내부적인 접근을 허용하지 않는 대신에 사용의 편의성을 제공해주는 역할을 합니다.
 - 

*/
public class MethodEx01 {
	
	int var1, var2;
	
	public int sum(int a, int b){
		return a + b;
	}
	
	public int times(int a, int b){
		return a * b;
	}

	public static void main(String[] args) {
		
		MethodEx01 mm = new MethodEx01();
		
		System.out.println(mm.sum(80, 20));
		
		System.out.println(mm.times(80, 20));

	}

}
