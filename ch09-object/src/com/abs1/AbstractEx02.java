package com.abs1;
/*

�߻�Ŭ������ ��Ӱ���
 - �߻�Ŭ�����鰣���� ����� �����մϴ�. 
 - �߻�Ŭ�����鰣�� ��ӿ����� ��ӹ��� �߻� �޼ҵ���� �� ������ �� �ʿ�� �����ϴ�.

*/

abstract class AbsEx1 {
	
	int a = 2016;
	final String str = "abstract test";
	
	public String getStr(){
		return str;
	}
	
	public abstract int getA();
}

abstract class AbsEx2 extends AbsEx1{
	
	@Override
	public int getA(){
		return a;
	}
	
	public abstract String getStr();
}

public class AbstractEx02 extends AbsEx2 {
	
	@Override
	public String getStr(){
		return str;
	}

	public static void main(String[] args) {
		
		AbstractEx02 ae = new AbstractEx02();
		
		System.out.println(ae.getA());
		System.out.println(ae.getStr());

	}

}
