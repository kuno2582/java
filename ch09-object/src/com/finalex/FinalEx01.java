package com.finalex;
/*

final
 - �� �̻��� Ȯ���� �Ұ������� �˸��� ������ �ǹ��մϴ�.
 - ������ final�� �ٿ� ���ȭ�Ǿ����� ����ÿ� ������ ������ �߻��ϰ� �˴ϴ�.
 
final ����
 - ������ final -> ���			
 - final �ڷ��� ������

 - �޼ҵ忡 final -> �������̵��� �Ұ���
 - ���������� final ��ȯ�� �޼ҵ��(){}
 
 - Ŭ������ final -> �� �̻��� ��� �Ұ���
 - ���������� final class Ŭ������{}


*/
public class FinalEx01 {
	
	int var1 = 100;
	
	final int var2 = 300;
	
	public static final int VAR3 = 400;

	public static void main(String[] args) {
		
		FinalEx01 f1 = new FinalEx01();
		System.out.println("f1.var ���� �� ��: " + f1.var1);
		
		f1.var1 = 200;
		System.out.println("f1.var ���� �� ��: " + f1.var1);
		
		System.out.println(f1.var2);
		//f1.var2 = 500;

		System.out.println(FinalEx01.VAR3);
		System.out.println(VAR3);
		
		final int NUM = 500;
		System.out.print(NUM);
		
	}

}
