/*

static 메소드
 - static변수와 동일
 

*/
public class StaticEx02_staticMethod {
	
	String s1 = "인스턴스 변수";
	static String s2 = "STATIC 변수";

	public static String getString(){
		return s2;
	}
	
	public static void main(String[] args) {

		StaticEx02_staticMethod sc = new StaticEx02_staticMethod();
		System.out.println(sc.s1);
		
		System.out.println(StaticEx02_staticMethod.s2);
		System.out.println(s2);
		System.out.println(getString());
		
		StaticEx02_staticMethod st = new StaticEx02_staticMethod();
//		System.out.println(st.s2); 추천하지 않는 static 호출 방법
		System.out.println(s2);
		System.out.println(st.s1);
		
	}

}
