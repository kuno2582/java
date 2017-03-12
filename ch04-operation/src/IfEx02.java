import java.util.Scanner;

/*
if ~else

if(조건식){
	true일때 수행되는 영역
}else{
	false일때 수행되는 영역
}

*/
public class IfEx02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a;
		
		System.out.println("정수를 데이터 하나를 입력 > ");
		a = input.nextInt();
		
		if(a%2 == 1){	//홀수 체크
			System.out.println("홀수입니다.");
		}else{
			System.out.println("짝수입니다.");
		}
		
		input.close();
		
	}

}
