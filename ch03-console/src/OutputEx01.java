/*
System.out.println()

System
 - java.lang 패키지에 묶여있는 클래스의 이름 (너무 많이 사용해서 자동으로 호출시켜줌)
 - 원래는 import.lang.System 라고 호출해주어야함.
 
Out
 - static 변수
 - PrintStream클래스의 참조변수
 
System.out,print()
 - 출력 후에 개행을 하지 않습니다.
 
*/
public class OutputEx01 {
	public static void main(String[] args) {
		
		System.out.print("출력이");
		System.out.print("종료되었습니다.");

	}
}
