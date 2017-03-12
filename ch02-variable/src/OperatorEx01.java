/*
연산자
자료(데이터)를 가공 하기위해 정해진 방식에 따라 결과를 얻어내는 기호

종류
산술 연산자 ( + - * / % )
증감 연산자
대입 연산자
비교 연산자
비트 연산자
논리 연산자
시프트 연산자
형변환 연산자
조건 연산자(삼항)

*/
public class OperatorEx01 {

	public static void main(String[] args) {
		
		int n1 = 7;
		int n2 = 3;
		
		int result = n1 + n2;
		System.out.println("덧셈결과: "+result);
		
		result = n1 - n2;
		System.out.println("뺄셈결과: "+result);
		
		System.out.println("곱셈결과: "+n1*n2);
		System.out.println("나눗셈결과: "+n1/n2);
		System.out.println("나머지결과: "+n1%n2);
		
	}

}
