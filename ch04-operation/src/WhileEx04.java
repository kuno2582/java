import java.util.Scanner;

//�Է°� ���� �հ� ���ϱ�

public class WhileEx04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		int i = 1;
		
		while(i != 0){
			System.out.println("���� �Է����ּ��� > ");
			i = scan.nextInt();
			sum += i;
			System.out.println("���ݱ����� �հ�� "+sum+"�Դϴ�.");
		}
		
		scan.close();

	}

}