
import java.util.Scanner;

public class InputEx05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("������ �Է� > ");
		String s_num = input.nextLine();
			int n = Integer.parseInt(s_num);
		
		
		System.out.println("n: " + n);
		
		System.out.println("�����ϴ� ������ �Է��ϼ���(���� �ҹ���) > ");
//		input.nextLine();	//���ۺ���
		input.skip("[\\r\\n]+");	//���๮�ڸ� ����
		String str = input.nextLine();
		System.out.println("str: "+str);
		

		input.close();
	}

}
