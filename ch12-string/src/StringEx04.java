
public class StringEx04 {

	public static void main(String[] args) {
		
		//암시적 객체 생성
		String str1 = "String Class";
		String str2 = "String Class";
		
		//명시적 객체 생성
		//동일 문자열이 존재해도 매번 새롭게 생성합니다.
		String str3 = new String("String Class");
		String str4 = new String(str2);
		
		if(str1 == str2)
			System.out.println("str1과 str2는 동일 인스턴스 참조");
		else
			System.out.println("str1과 str2는 다른 인스턴스 참조");
		
		if(str3 == str4)
			System.out.println("str3과 str4는 동일 인스턴스 참조");
		else
			System.out.println("str3과 str4는 다른 인스턴스 참조");

	}

}
