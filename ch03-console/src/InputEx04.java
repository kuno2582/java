
import java.util.Scanner;

public class InputEx04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String s1;
		
		//���� �Ǵ� ���ڿ� �Ѷ��� ��ü�� �Է�
		//���� ���ڱ��� \n
		s1 = scan.nextLine();
		System.out.println(s1);

		
		//���� �Ǵ� ���ڿ� ������ �������� �Է�
		String s2;
		s2 = scan.next();	//���� ������� �о����
		System.out.println(s2);
		
		
		scan.close();
	}

}
