package com.inner1;
/*

���� Ŭ����(Inner Class)
 - Ư�� Ŭ���� �ȿ� �� �ٸ� Ŭ������ ���ǵǾ��� �ִ� Ŭ����
 - �ϳ��� ���ó�� ����ϱ� ���ؼ� 
 - ����Ŭ������ �ܺ�Ŭ������ ��� ������� ��ġ �ڽ��� ���ó�� ����� �� �ֽ��ϴ�.
 - ����Ŭ���� �����Ϸ��� �ܺ�Ŭ������ ��ü�� ������ �Ŀ� ��ü�� ������ �� �ֽ��ϴ�.
 
 
class OuterŬ���� {
	//�������
	 
	class InnerŬ���� {
	
	}
	
}

���� Ŭ���� ����
Member		��������� ����޼ҵ�� ���� Ŭ������ ���ǵǾ����� ���
Local		�޼ҵ�ȿ� Ŭ������ ���ǵǾ� ���
Static		static������ ���� Ŭ������ static���� ����� ���
Anonymous	������ �� �ִ� �̸��� ���� ��쿡 ���


����Ŭ���� Ư¡
 - OuterŬ������ ��ü���� �Ŀ� InnerŬ������ ��ü ������ �� �ֽ��ϴ�.
 - InnerŬ���� �������� OutŬ������ ����� ���� ������ �����մϴ�.
 - InnerŬ������ �ν��Ͻ��� �ڽ��� ���� OuterŬ������ �ν��Ͻ��� ������� �����˴ϴ�.


*/

class Outer {
	
	int x = 100;
	
	class Inner {
		int y = 200;
	}
	
}




public class MemberEx01 {

	public static void main(String[] args) {
		
		Outer ot = new Outer();
		Outer.Inner oi = ot.new Inner();
		
		System.out.println("x: " + ot.x);
		System.out.println("y: " + oi.y);

	}

}
