
import java.util.Scanner;

public class InputEx02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int num4 = scanner.nextInt();
		int num5 = scanner.nextInt();
		
		int sum = num1 + num2 + num3 + num4 + num5;
		
		System.out.printf("문자열에 저장된 %d %d %d %d %d의 합은\n"+ "%d 입니다.",num1,
				num2,num3,num4,num5,sum);
		
		scanner.close();

	}

}
