import java.util.Scanner;

/*

switch~case��
 - caseŰ����, defaultŰ����
 - break�� ������ �ش� switch�� ���������� ���
 
 
if			switch
boolean		byte, short, int, char


switch(���ڰ�){
	case ���ǰ�1:
		���๮;
		break;
	case ���ǰ�2:
		���๮;
		break;
	default:
		���๮;
		break;
}

*/
public class SwitchEx01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ ���ڸ� �ϳ� �Է��ϼ��� >");
		int num1 = scan.nextInt();
		
		switch(num1){
		case 1:
			System.out.println("1 �Է��Ͽ����ϴ�.");
			break;
		case 2:
			System.out.println("2 �Է��Ͽ����ϴ�.");
			break;
		case 3:
			System.out.println("3 �Է��Ͽ����ϴ�.");
			break;
		default:
			System.out.println("1~3 �̿��� ���� �Է��Ͽ����ϴ�.");
		}
		
		scan.close();
	}

}
