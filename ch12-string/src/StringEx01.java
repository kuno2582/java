/*
String Ŭ����

 - ���ڿ� ��ü
 - String �ν��Ͻ��� ����� ���ڿ��� ������ �������� ���մϴ�.
 - ������ ���ڿ��� �ν��Ͻ��� �ϳ��� �����ϰ� �̸� �����ؼ� ����ϱ� ���ؼ��Դϵ�.
 - + �����ڸ� �̿��ؼ� ���ο� ���ڿ� ��ü�� ������ �� �ֽ��ϴ�.
 - ū ����ǥ(")�� ��� ǥ���� ���ڿ����� ��� �ν��Ͻ�ȭ ��ŵ�ϴ�.

String str = "��";
str = str + "����";	// "������" ���ο� ���ڿ� ��ü
str = str + "����";	// "����������"
str = str + "�ܿ�";	// "�����������ܿ�"


*/
public class StringEx01 {

	public static void main(String[] args) {
		
		java.lang.String str = "String instance";
		System.out.println(str);
		
//		System.out.println("�迭��ҷ� ����: " + str[3]);
		
		int strLength = str.length();
		System.out.println(strLength);

	}

}
