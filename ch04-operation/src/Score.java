import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int ���� = 0, ���� = 0, ���� = 0, ���� = 0;
		
		float ���;
		
		do{
		System.out.println("���� > ");
		���� = scan.nextInt();
		}while(���� < 0 || ���� > 100);
		
		do{
		System.out.println("���� > ");
		���� = scan.nextInt();
		}while(���� < 0 || ���� > 100);
		
		do{
		System.out.println("���� > ");
		���� = scan.nextInt();
		}while(���� <0 || ���� > 100);
		
		���� = ���� + ���� + ����;
		��� = ����/3;
		
		System.out.println("����: "+����);
		System.out.println("���: "+���);
		

		
		
		
		scan.close();
	}

}
