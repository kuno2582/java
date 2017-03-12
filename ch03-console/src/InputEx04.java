
import java.util.Scanner;

public class InputEx04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String s1;
		
		//문자 또는 문자열 한라인 전체를 입력
		//개행 문자까지 \n
		s1 = scan.nextLine();
		System.out.println(s1);

		
		//문자 또는 문자열 공백을 기준으로 입력
		String s2;
		s2 = scan.next();	//다음 공백까지 읽어오기
		System.out.println(s2);
		
		
		scan.close();
	}

}
