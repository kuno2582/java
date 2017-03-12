/*
피연산자가 정수이면 -> 정수형 연산 수행
피연산자가 실수이면 -> 실수형 연산 수행, %연산 제외(무시)
*/
public class OperatorEx03 {

	public static void main(String[] args) {
		
		System.out.println("정수형 나머지: " + 7%3);
		System.out.println("실수형 나머지: " + 7.2%3.0); //제대로 작동하지 않습니다.

	}

}
