
import java.util.Scanner;

public class InputEx05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("정수를 입력 > ");
		String s_num = input.nextLine();
			int n = Integer.parseInt(s_num);
		
		
		System.out.println("n: " + n);
		
		System.out.println("좋아하는 요일을 입력하세요(영문 소문자) > ");
//		input.nextLine();	//버퍼비우기
		input.skip("[\\r\\n]+");	//개행문자를 제거
		String str = input.nextLine();
		System.out.println("str: "+str);
		

		input.close();
	}

}
