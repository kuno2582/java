import java.util.Scanner;

public class InputEx03 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		/*System.out.println("����� �̸���?");
		
		String str = keyboard.nextLine();
		System.out.println("�ȳ��ϼ���. " + str + "��");
		
		
		System.out.println("�� ����� �� ����ٰ� �����Ͻʴϱ�?" + 
				"��(true)/�ƴϿ�(false)�� ���ϼ���.");
		
		boolean isTrue = keyboard.nextBoolean();
		
		if(isTrue == true){
			System.out.println("�߻��屺��.");
		}else{
			System.out.println("�����屺��.");
		}*/
		
		/*System.out.println("��Ű� ¦���� ����������?");
		
		double num1 = keyboard.nextDouble();
		double num2 = keyboard.nextDouble();
		double diff = num1 - num2;
		if(diff>0){
			System.out.println("����� "+diff+"��ŭ �� �����ϴ�.");
		}else{
			System.out.println("������ "+(-diff)+"��ŭ �����ϴ�.");
		}*/
		
		System.out.println("����� Ű��?");
		double num3 = keyboard.nextDouble();
		
		System.out.println("����� Ű�� " + num3 + "�Դϴ�.");
		
		keyboard.close();

	}

}
