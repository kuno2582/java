package com.stringbufferex;

public class StringBufferEx02 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("�ڹ� ���� ����?");
		
		System.out.println(sb);
		
		sb.insert(2, '��');
		System.out.println(sb);
		
		sb.append(" ����Ŭ��");
		System.out.println(sb);
		
		sb.append(" ����ִ�.");
		System.out.println(sb);
		
		sb.replace(0, 3, "Android");
		System.out.println(sb);
		
		sb.delete(0, 8);
		System.out.println(sb);

		String str = sb.toString();
		System.out.println(str);
	}

}
