
public class WhileEx05 {

	public static void main(String[] args) {

		java.util.Scanner input = 
				new java.util.Scanner(System.in);
		
		int num = 0;
		int total = 0;
		
		System.out.println("0�Է� ������ ������ �հ豸�մϴ�.");
		System.out.print("������ ������ �Է��ϼ��� > ");
		
		while((num=input.nextInt()) !=0 ){
			total += num;
			System.out.println("�����հ� =" + total);
			
			System.out.println("������ ������ �Է� > ");
			
		}
		System.out.println("���α׷� ����");
		
		input.close();
	}

}
