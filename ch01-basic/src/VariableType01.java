/*
���� �ڷ���
 - ����
 - ������
 - ������
 - �Ǽ���
*/
public class VariableType01 {
	public static void main(String[] args){
		
		boolean bool = true;
		//true, false ���� �ڷ���
		//ũ��: 1byte
		System.out.println("bool: " + bool);
		
		//������ �ڷ���
		//ũ��: 2byte
		char char_a1 = 'A';
		System.out.println("char_a1 : " + char_a1);
		
		char char_a2 = 65;
		System.out.println("char_a2 : " + char_a2);
		
		char char_c1 = '��';
		System.out.println("char_c1 : " + char_c1);
		
		char char_c2 = '\uc790';
		System.out.println("char_c2 : " + char_c2);
		
		//������
		//ũ��: 1byte
		//byte b1 = 128;
		byte b1 = 127;
		System.out.println(b1);
		
		//2byte (-32,768~32,767)
		//short s1 = 32768;
		short s1 = 32767;
		System.out.println("s1 : " + s1);
		
		//4byte (-2,147,483,648~2,147,483,647)
		int i1 = 12345678;
		System.out.println("i1 : " + i1);
		
		//8byte
		long lg1 = 123456;
		long lg2 = 123456l; //���� l�� ������ long���̶�� ���� �˷���
		long lg3 = 123456L;
		
		System.out.println("lg1: " + lg1);
		System.out.println("lg2: " + lg2);
		System.out.println("lg3: " + lg3);
		
		
		//�Ǽ���
		//4byte
		float f1 = 9.1F;
		System.out.println("f1: " + f1);
		
		//double ũ��: 8byte
		double d1 = 9.8;
		double d2 = 9.8d;
		System.out.println("d1: " + d1);
		System.out.println("d2: " + d2);
		
	}
}
