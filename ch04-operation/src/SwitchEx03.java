import java.util.Scanner;

/*
성적등급 처리
 - case문을 그룹핑하여 처리
 - char 조건값 비교
 - switch~case문

*/
public class SwitchEx03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수형 성적을 입력해주세요 > ");
		
		int point = scan.nextInt();
		
		
		
		switch(point/10){
		case 10:
		case 9:
			System.out.printf("점수%d 는 A등급입니다.\n",point);
			break;
		case 8:
			System.out.printf("점수%d 는 B등급입니다.\n",point);
			break;
		case 7:
			System.out.printf("점수%d 는 C등급입니다.\n",point);
			break;
		case 6:
			System.out.printf("점수%d 는 D등급입니다.\n",point);
			break;
		default:
			System.out.printf("점수%d 는 F등급입니다.\n",point);
			break;
			
		}
		
		scan.close();

	}

}
