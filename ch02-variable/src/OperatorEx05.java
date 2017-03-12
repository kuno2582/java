/*

관계연산자(비교연산자)
값을 비교할 때 사용
결과는 항상 true 또는 false (boolean)반환

a > b 	크다.
a < b 	작다.
a >= b	크거나 같다.
a <= b  작거나 같다.
a == b  같다.
a != b  같지 않다.

*/
public class OperatorEx05 {
	
	public static void main(String[] args){
		
		int a = 10;
		int b = 20;
		boolean result;
		
		result = a < b;
		System.out.println("a < b: " + result);
		
		result = a > b;
		System.out.println("a > b: " + result);
		
		result = a <= b;
		System.out.println("a <= b: " + result);
		
		result = a >= b;
		System.out.println("a >= b: " + result);
		
		result = a == b;
		System.out.println("a == b: " + result);
		
		result = a != b;
		System.out.println("a != b: " + result);
		
		
	}

}
