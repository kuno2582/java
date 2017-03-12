package com.inner3;
/*
���� ���� Ŭ���� Ư¡
 - ��������ó�� ���
 - ���ó��� Ŭ������ ���������� �޼ҵ尡 ȣ��� �� 
 - ���ó��� Ŭ������ �Ҹ������ �޼ҵ尡 ����� �� 
 - OuterŬ������ ��������� ������� ���ٰ���
 - ���ó��� Ŭ������ ���ǵ� �޼ҵ峻�� ���ú������� ������ �� �����ϴ�.
 - ���ó��� Ŭ������ ��ü������ �ش� Ŭ������ ���Ե� �޼ҵ忡���� �����մϴ�.
 
���� Ŭ������ ���������� �Ű����� ����
 - �޼ҵ尡 ��ȯ�Ǵ� ���� �Ű������� ���������� �Ҹ�˴ϴ�.
 - ��, final�� ����� ������ ������ ����մϴ�.

*/

public class LocalEx02 {

	int a = 100;
	
	public void innerTest(){
		
		int b = 200;
		
		class Inner {
			int c = 300;
			final int NUM = 400;
			
			public void getData(){
				System.out.println("a: " + a);
				
				System.out.println("b: " + b);
				
				System.out.println("c: " + c);
				
				System.out.println("NUM: " + NUM);
			}
		}
		
		Inner in = new Inner();
		in.getData();
		
	}
	
	public static void main(String[] args) {
		
		LocalEx02 lo = new LocalEx02();
		lo.innerTest();

	}

}
