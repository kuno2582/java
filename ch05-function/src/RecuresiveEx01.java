/*
재귀호출
 - 자료구조 알고리즘을 이해하기 위해서 필요한 부분
 - 재귀적으로 메소드 호출하는 것
 - 함수의 복사본을 하나 더 생성해서 실행하는 것이 재귀입니다.
 - 종료조건이 만족하지 않으면 무한루프에 빠질 수 있습니다. (주의)
 - 종료조건 메소드 실행부분과 재귀메소드가 실행되는 부분에 종료조건을 위치시켜야 합니다.

재귀메소드(Recursive Method)




*/
public class RecuresiveEx01 {

	public static void main(String[] args) {
		System.out.println("5! = "+factorial(5));
	}
	
	public static int factorial(int n){
		
		if(n==1)
			return 1;
		else
			return n*factorial(n-1);
	}

}
