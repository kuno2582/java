
/*
변수
 - 데이터 저장하기 위한 임시 저장 공간(메모리 공간)
 - 프로그램이 실행되는 동안 값(데이터)를 변경할 수 있습니다.
 
식별자 명명 규칙
 - 영문자(대문자, 소문자), 숫자(0~9)의 조합, _와 $만 사용
 - 첫글자는 반드시 영문자 또는 '_'로 시작해야 합니다. 숫자로 시작하지 못합니다.
 - 대소문자를 철저히 구분
 - Java에서 사용하고 있는 예약어는 식별자로 사용할 수 없습니다.
 - 식별자명은 그 역할에 맞는 의미있는 이름을 부여해주어야 합니다.
  */

public class VariableEx01 {
	public static void main(String[] args){
		
		//자료형 변수명
		int num; //변수 선언
		num = 20;
		System.out.println(num);
		
		int number = 30;
		System.out.println(number);
		
//		int nn;
//		System.out.println(nn);
	}
}
