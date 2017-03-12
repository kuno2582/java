import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
throws
 - ���� �޼ҵ忡�� ����ó���� �ϱⰡ ���� ����� ������ �� ���� �������� ����ó����
 	�ϴ� ���̾ƴ϶� ȣ���� ������ ����ó���� �� �� �ֵ��� ���ܰ�ü�� ��� ó���� �޶�� �絵�ϴ� ���� �ǹ�
 - throws ����ؼ� �߻��� ���ܰ�ü�� �絵�� �մϴ�.
 - �絵�� ���� ������ �ٽ� �絵�� �����մϴ�.�������� �ݵ�� try catch������ ����ó���� �ؾ�
 	���α׷��� ��� ������ �� �ֽ��ϴ�.


*/
public class ExceptionEx05 {
	
	private void printData() throws IOException, NumberFormatException {	//readLine�� ���� ���� ó��
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));//����Ʈ ������ �о ���ڷ� ��ȯ
		
		System.out.println("�� �Է� > ");
		int dan = Integer.parseInt(br.readLine());	//���� �߻������� �޼ҵ�� �ڿ� ���
		System.out.println("�Էµ� ��: " + dan);
		
		for(int i=1; i<=9; i++){
			System.out.println(dan + "*" + i + "=" + dan*i);
		}
		
	}

	public static void main(String[] args) {
		
		ExceptionEx05 ex = new ExceptionEx05();
		
		try{
			
			ex.printData();
			
		}catch(Exception e){
			System.out.println("������ �߻��߽��ϴ�.");
		}
		

	}

}
