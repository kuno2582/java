package com.stringbufferex;
/*
StringBufferŬ����
 - ���ڿ� ���� ��ü
 - ���ڿ� �߰� ����


*/
public class StringBufferEx01 {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("Code");
		StringBuffer sb2 = sb1.append(" Dragon");
		
		String str = null;
		
		if(sb1 == sb2)
			str = "sb1�� sb2�� ���� �����ϴ�.";
		else
			str = "sb1�� sb2�� ���� �ٸ��ϴ�.";
		
		System.out.println(str);
		
		str = sb1.toString();
		System.out.println("sb1: " + str);
		
		str = sb2.toString();
		System.out.println("sb2: " + str);

	}

}
