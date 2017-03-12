/*
논리 연산자 (boolean 연산자)
true와 false 논리값을 가지고 다시 한번도 조건 연산하는 연산자

&&	논리곱	주어진 조건들이 모두 true일 경우에만 -> true반환
	AND


||	논리합	주어진 조건들 중 하나라도 true이면 -> true
	OR


!	부정		true이면 false
	NOT		false이면 true


선조건 && 후조건		결과
true	true		true
true	false		false
false	true		false
false	false		false

선조건 || 후조건		결과
true	true		true	
true	false		true
false	true		true
false	false		false

!조건	결과
true	false
false 	true
*/
public class OperatorEx09 {
	
	public static void main(String[] args){
		boolean t, f, result;
		t = true;
		f = false;
		
		result = t && f;
		System.out.println("t && f: " + result);
		
		result = t || f;
		System.out.println("t || f: " + result);
		
		result = !t;
		System.out.println("!t: " + result);
		
	}
}
