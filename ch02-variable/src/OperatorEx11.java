/*
논리연산자의 SCE(Short-Circuit Evaluation)
- 최단거리 연산
- 연산결과가 나온것에 대해 더 이상 연산을 수행하지 않는 것을 얘기합니다.
- 자바는 SCE 연산을 지원


선조건 && 후조건
선조건이 true일때만 후조건을 연산합니다.
선조건이 false일 경우 후조건을 실행하지 않습니다.
true  && true -> true
         false -> false
false && X

선조건 || 후조건
선조건이 true이면 후조건을 실행하지 않습니다.
선조건이 false인 경우에만 후조건을 실행합니다.
true  || X  -> true
false || true -> true
         false -> false


*/
public class OperatorEx11 {
	
	public static void main(String[] args){
		
		int num1=0, num2=0;
		boolean result;
		
		result = ( (num1+=10)<0 ) && ( (num2+=10)>0 ) ;
		//(num1+=10)<0 -> 0+=10<0 -> 10<0 -> false
		//(num2+=10)>0 -> 0+=10>0 -> 10>0 -> true (연산 수행 안함)
		System.out.println("result: " + result);
		System.out.println("num1: " + num1 + ", num2: " + num2);
		
		
		result = ( (num1+=10)>0 ) || ( (num2+=10)>0 );
		//(num1+=10)>0 -> (10+=10)>0 -> 20>0 -> true
		//(num2+=10)>0 -> (0+=10)>0 -> 10>0 -> true (연산 수행 안함)
		
		System.out.println("result: " + result);
		System.out.println("num1: " + num1 + ", num2: " + num2);
		
		
	}

}
