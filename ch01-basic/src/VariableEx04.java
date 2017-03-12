/*

문자는 유니코드기반으로 표현(문자하나는 2byte 표현)
유니코드: 전세계 문자를 표현하기 위한 코드 집합
문자를 표현 -> 작은 따옴표(') 사용

*/
public class VariableEx04 {
	public static void main(String[] args){
		
		char ch1 = 'A';
		char ch2 = '한';
		char ch3 = 54620;
		char ch4 = 0x3081;
		char ch5 = 0x3082;
		char ch6 = '1';
		char ch7 = 1;
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch5);
		System.out.println(ch6);
		System.out.println(ch7);
		
	}
}
