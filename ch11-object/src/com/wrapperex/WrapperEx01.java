package com.wrapperex;
/*
Wrapper Ŭ����(���� Ŭ����)
 - �⺻ �ڷ��� �����͸� �ν��Ͻ�ȭ �ؾ��ϴ� ��Ȳ���� ����� �� �ִ� Ŭ����
 - �⺻ �ڷ����� �����ڷ������� ��ȯ�Ҷ� ����ϴ� Ŭ����
 - �⺻ ������ Ÿ���� ��ġ ��ü�� ��ó�� ������ִ� Ŭ����
 
�⺻ �ڷ���			WrapperŬ����
boolean			Boolean
char			Character
byte			Byte
short			Short
int				Integer
long			Long
float			Float
double			Double


WrapperŬ������ Boxing & UnBoxing
Boxing			�⺻�ڷ��� -> �����ڷ���
				�⺻�ڷ��� �����͸� Wrapper �ν��Ͻ��� ���δ� ��
				
UnBoxing		�����ڷ��� -> �⺻�ڷ���
				Wrapper �ν��Ͻ��� ����� �����͸� ������ ��



*/
public class WrapperEx01 {

	public static void main(String[] args) {
		
		boolean b = true;
		Boolean wrap_boolean = new Boolean(b);
		
		System.out.println("b: " + b);
		System.out.println("wrap_boolean: " + wrap_boolean.booleanValue());	//��ü�ȿ� �ִ� boolean���� ���� �ڷ������� ����

		Integer wrap_integer = new Integer(100);
		int i = wrap_integer.intValue();
		System.out.println("i: " + i);
		System.out.println("wrap_integer: " + wrap_integer);
		
	}

}
