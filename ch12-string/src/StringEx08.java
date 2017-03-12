/*
replace(old, nw)
 - ���ڿ� ��ü

toLowerCase()
 - �ҹ��ڷ�
 
toUpperCase()
 - �빮�ڷ�
 
trim()
 - ���鹮�� ����
 - ���ڿ��� ���� ���� ������ ���� �ִ� ������ ������ �� ���ڿ� ��ȯ�Ѵ�
 - ���ڿ� �߰��� �ִ� ������ ���ŵ��� �ʴ´�.
 
contains(String str)
 - ������ ���ڿ��� ���ԵǾ� �ִ��� �˻� -> true/false
 
concat(String str)
 - ���ڿ��� �������ִ� �޼ҵ�
 
equals(Object obj)
 - ���ڿ� ��ġ ���� �˻�
 
toString(Object obj)
 - ���ڿ��� �ν��Ͻ�
 
*/
public class StringEx08 {

	public static void main(String[] args) {
		
		String str = "    aaaaabbAAABB   ";
		
		String msg1 = null;	//���� �ǰ� ��ü ���� �ȵ�
				
		String msg2 = "";	//��ü�� �����ǰ� �����ʹ� ����
		
		msg2 = str.replace("aa", "b");
		System.out.println(msg2);
		
		msg1 = str.toUpperCase();
		System.out.println(msg1);
		
		msg1 = str.toLowerCase();
		System.out.println(msg1);
		
		msg2 = str.trim();
		System.out.println(msg2);
		
		boolean check = str.contains("aa");
		System.out.println(check);
		
		String before = "There are two ways of spreading light";
		String after = "to be candle or the mirror that reflects it.";
		String result = before.concat(after);
		System.out.println(result);
		
		String s1 = "Hello";
		boolean b1 = s1.equals("Hello");
		boolean b2 = s1.equals("hello");
		System.out.println(b1);
		System.out.println(b2);
		
		String s2 = "Everythings gonna be alright.";
		String s3 = s2.toString();
		System.out.println(s3);
		
	}

}
