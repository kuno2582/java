/*

형변환 종류
 - 프로모션
 - 디모션
 
프로모션(promotion)
 - 작은 자료형 타입에서 큰 자료형 타입으로 변환될 때
 - 자동 형변환
 - 정보의 손실 없음
 
 byte -> short/char -> int -> long
 float -> double
 
디모션(demotion)
 - 큰 자료형 -> 작은 자료형
 - 명시적 형변환
 - 경우에 따라서 정보의 손실 있음
 
명시적 형변환
 - 의도한 형변환이라는 것을 표시
 - 중괄호() 사용해서 표현
 
*/
public class CastEx01 {

	public static void main(String[] args) {
		
		char ch1 = 'A';
		char ch2 = 'Z';
		
		int num1 = ch1;
		int num2 = (int)ch2;
		
		System.out.println("문자 A의 유니코드 값: " + num1);
		System.out.println("문자 Z의 유니코드 값: " + num2);

	}

}
