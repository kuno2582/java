/*

���迬����(�񱳿�����)
���� ���� �� ���
����� �׻� true �Ǵ� false (boolean)��ȯ

a > b 	ũ��.
a < b 	�۴�.
a >= b	ũ�ų� ����.
a <= b  �۰ų� ����.
a == b  ����.
a != b  ���� �ʴ�.

*/
public class OperatorEx05 {
	
	public static void main(String[] args){
		
		int a = 10;
		int b = 20;
		boolean result;
		
		result = a < b;
		System.out.println("a < b: " + result);
		
		result = a > b;
		System.out.println("a > b: " + result);
		
		result = a <= b;
		System.out.println("a <= b: " + result);
		
		result = a >= b;
		System.out.println("a >= b: " + result);
		
		result = a == b;
		System.out.println("a == b: " + result);
		
		result = a != b;
		System.out.println("a != b: " + result);
		
		
	}

}
