
public class StringEx04 {

	public static void main(String[] args) {
		
		//�Ͻ��� ��ü ����
		String str1 = "String Class";
		String str2 = "String Class";
		
		//����� ��ü ����
		//���� ���ڿ��� �����ص� �Ź� ���Ӱ� �����մϴ�.
		String str3 = new String("String Class");
		String str4 = new String(str2);
		
		if(str1 == str2)
			System.out.println("str1�� str2�� ���� �ν��Ͻ� ����");
		else
			System.out.println("str1�� str2�� �ٸ� �ν��Ͻ� ����");
		
		if(str3 == str4)
			System.out.println("str3�� str4�� ���� �ν��Ͻ� ����");
		else
			System.out.println("str3�� str4�� �ٸ� �ν��Ͻ� ����");

	}

}
