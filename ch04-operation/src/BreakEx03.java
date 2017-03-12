/*
3의 배수이고 7의 배수인 정수 찾으면
더 이상 수행하지 않고  while문을 빠져나오는 프로그램

1~100
3의 배수이고 7의 배수인 정수 찾으면 while문을 빠져나오기
while문을 빠져나온 다음 찾은 숫자를 출력하고, 
찾지 못한 경우는 찾지 못했다고 출력하기

*/

public class BreakEx03 {

	public static void main(String[] args) {
		
		int i=1;
		
		while(i<=100){
			
			if(i%3==0 && i%7==0)
				break;
			i++;
		}
		
		System.out.println("찾은 숫자는: " + i);

	}

}
