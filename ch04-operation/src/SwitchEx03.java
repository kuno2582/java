import java.util.Scanner;

/*
������� ó��
 - case���� �׷����Ͽ� ó��
 - char ���ǰ� ��
 - switch~case��

*/
public class SwitchEx03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ ������ �Է����ּ��� > ");
		
		int point = scan.nextInt();
		
		
		
		switch(point/10){
		case 10:
		case 9:
			System.out.printf("����%d �� A����Դϴ�.\n",point);
			break;
		case 8:
			System.out.printf("����%d �� B����Դϴ�.\n",point);
			break;
		case 7:
			System.out.printf("����%d �� C����Դϴ�.\n",point);
			break;
		case 6:
			System.out.printf("����%d �� D����Դϴ�.\n",point);
			break;
		default:
			System.out.printf("����%d �� F����Դϴ�.\n",point);
			break;
			
		}
		
		scan.close();

	}

}