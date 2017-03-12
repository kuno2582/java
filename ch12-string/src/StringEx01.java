/*
String 클래스

 - 문자열 객체
 - String 인스턴스에 저장된 문자열의 내용을 변경하지 못합니다.
 - 동일한 문자열의 인스턴스를 하나만 생성하고 이를 공유해서 사용하기 위해서입니디.
 - + 연산자를 이용해서 새로운 문자열 객체를 생성할 수 있습니다.
 - 큰 따옴표(")로 묶어서 표현된 문자열들은 모두 인스턴스화 시킵니다.

String str = "봄";
str = str + "여름";	// "봄여름" 새로운 문자열 객체
str = str + "가을";	// "봄여름가을"
str = str + "겨울";	// "봄여름가을겨울"


*/
public class StringEx01 {

	public static void main(String[] args) {
		
		java.lang.String str = "String instance";
		System.out.println(str);
		
//		System.out.println("배열요소로 접근: " + str[3]);
		
		int strLength = str.length();
		System.out.println(strLength);

	}

}
