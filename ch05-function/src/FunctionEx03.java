
/*

함수의 반환값
 - 하나의 결과값을 돌려줄때 return문과 함께 사용
 - 함수가 돌려줄 값에 따라서 함수 이름 앞에 데이터형이 결정되게 됩니다.
 - 돌려줄 값이 없으면 void형으로 함수를 선언해주어야 합니다.
 
 
return 
 - 현재 실행중인 그 함수를 종료시키고, 함수를 호출한 곳으로 이동하는 역할
 - 함수의 값을 돌려줄 때 return문과 함께 사용(값의 반환)
 - 함수가 반환할 값이 없다면 return; 문을 생략가능
 
static
 - 공유개념, 클래스에 객체를 생성하지 않아도 접근가능하게 함.
*/
public class FunctionEx03 {

	public static void main(String[] args) {
		
		System.out.println(plus(3,7));
		System.out.println(square(8));
		byExit();
	
	}
	
	public static int plus(int num1, int num2){
		
		
		return num1+num2;
	}
	
	public static double square(double num){
		return num*num;
	}
	
	public static void byExit(){
		System.out.println("프로그램 종료!");
	}
	
	

}
