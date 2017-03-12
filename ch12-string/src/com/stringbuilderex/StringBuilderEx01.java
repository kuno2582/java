package com.stringbuilderex;
/*
StringBuilderŬ����
 - ���ڿ� ���� �� ������ �ϱ����� �޸� ������ ������ �ִ� Ŭ����
 - ���ڿ� �����ϴ� Ŭ����
 - ����� �����͸� �̿��ؼ� ���ڿ��� ������ִ� Ŭ����
 append(), insert() ���ڿ� �����͸� �߰�
 
 String
 ��������� �ν��Ͻ� ����
 
 StringBuilder
 ���������� �ν��Ͻ� ����


*/
public class StringBuilderEx01 {

	public static void main(String[] args) {
		
		StringBuilder stringBuilder = new StringBuilder("Oracle");
		System.out.println(stringBuilder);
		
		stringBuilder.append(27);
		System.out.println(stringBuilder);
		
		stringBuilder.append('J').append(true);
		System.out.println(stringBuilder);
		
		stringBuilder.insert(9, "ava");	//9��° �ڸ� ���ĺ��� �߰�
		System.out.println(stringBuilder);
		
		stringBuilder.insert(stringBuilder.length(),'Z');
		System.out.println(stringBuilder);

	}

}
