package com.inner2;
/*

static ���� Ŭ����
 - ����Ŭ�����ȿ� static������ ������ �ִٸ� �� ����Ŭ������ static���� �����ؾ��մϴ�.

*/
public class StaticEx01 {

	public static class  StaticInner {
		int iv = 200;
		static int cv = 300;
	}
	
	public static void main(String[] args) {
		
		StaticEx01.StaticInner ii = new StaticEx01.StaticInner();
		
		System.out.println(ii.iv);
//		System.out.println(ii.cv);	��õ���� �ʴ� static ȣ�� ���
		
		System.out.println(StaticEx01.StaticInner.cv);	//��õ�ϴ� ���

	}

}
