/*

���� catch��
�ϳ��� try�� ���� �������� ���ܰ� �߻��� �� ����մϴ�.

try{
	//���� �߻� ������ ����
}catch(���󿹿� ��ü1 ������){

}catch(���󿹿� ��ü2 ������){

}catch(���󿹿� ��ü3 ������){

}


*/
public class ExceptionEx04 {

	public static void main(String[] args) {
		
		int var = 10;
		
		try{
			
			int data = Integer.parseInt(args[0]);
			System.out.println(var/data);
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("�Է��� �����Ͱ� �����ϴ�.");
		}catch(NumberFormatException e){
			System.out.println("���ڰ� �ƴմϴ�.");
		}catch(ArithmeticException e){
			System.out.println("0���� ���� �� �����ϴ�.");
		}catch(Exception e){	//��� ���� ó��, �׻� �������� ��ġ��Ű��
			System.out.println("������ ���� �߻�");
		}
		
		System.out.println("���α׷� ��");

	}

}
