
public class BreakEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner input = 
				new java.util.Scanner(System.in);
		
		int a = 0;
		int total = 0;
		
		System.out.println("0������ �Է¹��� ������ �� ���ϱ�");
		while(true){
			
			System.out.print("������ ������ �Է��ϼ��� > ");
			a = input.nextInt();
			
			//Ư�� ���� -> �ݺ��� Ż��(���ѷ��� Ż��)
			if( a==0 )
				break;
			else
				total += a;
		}
		System.out.println("total: " + total);
		
		input.close();

	}

}
