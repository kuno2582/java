/*
실수
 - 오차를 동반
 - 정밀도를 포기하는 대신에 표현할수 있는 값의 범위를 넓힌 근사값을 사용
 
float vs double
 - 충분한 표현범위를 가지고 있습니다.
 - 4byte vs 8byte
 - 큰 차이점은 정밀도의 차이가 있습니다.
 - 필요한 정밀도를 바탕으로 자료형을 결정해야 합니다.
 - 일반적으로 double 자료형 사용 권장

*/
public class VariableDouble01 {
	public static void main(String[] args){
		
		double num1, num2, result;
		num1 = 11.0000001;
		num2 = 22.0000002;
		result = num1 + num2;
		
		System.out.println(result);
		
	}
}
