/*

����ȯ ����
 - ���θ��
 - ����
 
���θ��(promotion)
 - ���� �ڷ��� Ÿ�Կ��� ū �ڷ��� Ÿ������ ��ȯ�� ��
 - �ڵ� ����ȯ
 - ������ �ս� ����
 
 byte -> short/char -> int -> long
 float -> double
 
����(demotion)
 - ū �ڷ��� -> ���� �ڷ���
 - ����� ����ȯ
 - ��쿡 ���� ������ �ս� ����
 
����� ����ȯ
 - �ǵ��� ����ȯ�̶�� ���� ǥ��
 - �߰�ȣ() ����ؼ� ǥ��
 
*/
public class CastEx01 {

	public static void main(String[] args) {
		
		char ch1 = 'A';
		char ch2 = 'Z';
		
		int num1 = ch1;
		int num2 = (int)ch2;
		
		System.out.println("���� A�� �����ڵ� ��: " + num1);
		System.out.println("���� Z�� �����ڵ� ��: " + num2);

	}

}
