
public class StringEx05 {

	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "Hello";
		
		if(str1 == str2)
			System.out.println("str1�� str2�� ���� �ν��Ͻ� ����");
		else
			System.out.println("str1�� str2�� �ٸ� �ν��Ͻ� ����");
		
		if(str1.equals(str2))
			System.out.println("str1�� str2�� ������ �����ϴ�.");
		else
			System.out.println("str1�� str2�� ������ �ٸ��ϴ�.");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1.getClass());
		System.out.println(str2.getClass());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println("---------------------------");
		
		
		String msg1 = new String("World");
		String msg2 = new String("World");
		
		if(msg1 == msg2)
			System.out.println("msg1�� msg2�� ���� �ν��Ͻ� ����");
		else
			System.out.println("msg1�� msg2�� �ٸ� �ν��Ͻ� ����");
		
		if(msg1.equals(msg2))
			System.out.println("msg1�� msg2�� ������ �����ϴ�.");
		else
			System.out.println("msg1�� msg2�� ������ �ٸ��ϴ�.");
		
		System.out.println(msg1);
		System.out.println(msg2);
		System.out.println(msg1.getClass());
		System.out.println(msg2.getClass());
		System.out.println(msg1.hashCode());
		System.out.println(msg2.hashCode());

	}

}
