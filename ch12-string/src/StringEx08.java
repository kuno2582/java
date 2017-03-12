/*
replace(old, nw)
 - 문자열 대체

toLowerCase()
 - 소문자로
 
toUpperCase()
 - 대문자로
 
trim()
 - 공백문자 제거
 - 문자열의 왼쪽 끝과 오른쪽 끝에 있는 공백을 제거한 후 문자열 반환한다
 - 문자열 중간에 있는 공백은 제거되지 않는다.
 
contains(String str)
 - 지정된 문자열이 포함되어 있는지 검사 -> true/false
 
concat(String str)
 - 문자열을 연결해주는 메소드
 
equals(Object obj)
 - 문자열 일치 여부 검사
 
toString(Object obj)
 - 문자열을 인스턴슨
 
*/
public class StringEx08 {

	public static void main(String[] args) {
		
		String str = "    aaaaabbAAABB   ";
		
		String msg1 = null;	//선언만 되고 객체 생성 안됨
				
		String msg2 = "";	//객체는 생성되고 데이터는 없음
		
		msg2 = str.replace("aa", "b");
		System.out.println(msg2);
		
		msg1 = str.toUpperCase();
		System.out.println(msg1);
		
		msg1 = str.toLowerCase();
		System.out.println(msg1);
		
		msg2 = str.trim();
		System.out.println(msg2);
		
		boolean check = str.contains("aa");
		System.out.println(check);
		
		String before = "There are two ways of spreading light";
		String after = "to be candle or the mirror that reflects it.";
		String result = before.concat(after);
		System.out.println(result);
		
		String s1 = "Hello";
		boolean b1 = s1.equals("Hello");
		boolean b2 = s1.equals("hello");
		System.out.println(b1);
		System.out.println(b2);
		
		String s2 = "Everythings gonna be alright.";
		String s3 = s2.toString();
		System.out.println(s3);
		
	}

}
