/*

Scanner Ŭ����
 - Ű����� �Է��� ������ �Է¹޾Ƽ� ����� �� �ֽ��ϴ�.
 - �پ��� ���ҽ�(Ű���� �̿ܿ���)�� �Է� ���� �� �ֵ��� ���ǵ� Ŭ����
 - java.util ��Ű�� �ȿ� �ִ� Ŭ���� (java.util.Scanner)

*/
public class InputEx01 {

	public static void main(String[] args) {
		
		String source = "1 3 5 7 9";
		
		//���ڿ��� �Է´�������ϴ� Scanner��ü(�ν��Ͻ�) ����
		java.util.Scanner scanner = new java.util.Scanner(source);
		
		int num1 = scanner.nextInt(); //1
		int num2 = scanner.nextInt(); //3
		int num3 = scanner.nextInt(); //3
		int num4 = scanner.nextInt(); //3
		int num5 = scanner.nextInt(); //3
		
		int sum = num1 + num2 + num3 + num4 + num5;
		
		System.out.printf("���ڿ��� ����� %d %d %d %d %d�� ����\n"+ "%d �Դϴ�.",num1,
				num2,num3,num4,num5,sum);
		
		scanner.close();

	}

}
