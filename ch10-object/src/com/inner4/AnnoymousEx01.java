package com.inner4;
/*
Anonymous ���� Ŭ����(�͸� ���� Ŭ����)
 - �͸��� �̸��� ���� ���� �ǹ��մϴ�. (���ǵ� Ŭ������ �̸��� ���ٴ� ��)
 - localŬ������ ���������� Ŭ������ �̸��� ���ǵǾ� ���� �ʴٴ� ��ǿ��� ���̰� �ֽ��ϴ�.
 - �� �������� ; (�����ݷ�) ���
 
 class Inner(){
 	
 }
 
 class Outer{
 	
 	Inner inner = new Inner(){
 	};
 	
 	public void method(){
 		new Inner(){
 		};
 	}
 }

*/

class InnerParent {
	
	public void display(){
		System.out.println("�θ�Ŭ������ display");
	}
	
}

public class AnnoymousEx01 {
	
	public void innerTest(){
		
		class Inner extends InnerParent {
			@Override
			public void display(){
				System.out.println("�ڽ�Ŭ������ display");
			}
		}
		
		Inner i = new Inner();
		i.display();
	}

	public static void main(String[] args) {
		
		AnnoymousEx01 anony = new AnnoymousEx01();
		anony.innerTest();

	}

}
