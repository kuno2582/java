import java.util.Scanner;

/*

switch~case문
 - case키워드, default키워드
 - break문 만나면 해당 switch문 빠져나가는 제어문
 
 
if			switch
boolean		byte, short, int, char


switch(인자값){
	case 조건값1:
		수행문;
		break;
	case 조건값2:
		수행문;
		break;
	default:
		수행문;
		break;
}

*/
public class SwitchEx01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수형 숫자를 하나 입력하세요 >");
		int num1 = scan.nextInt();
		
		switch(num1){
		case 1:
			System.out.println("1 입력하였습니다.");
			break;
		case 2:
			System.out.println("2 입력하였습니다.");
			break;
		case 3:
			System.out.println("3 입력하였습니다.");
			break;
		default:
			System.out.println("1~3 이외의 값을 입력하였습니다.");
		}
		
		scan.close();
	}

}
