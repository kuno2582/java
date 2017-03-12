package com.inner3;
/*
���� ���� Ŭ����(Local Inner Class)
 - OuterŬ������ �޼ҵ�ȿ� ���ӵ� Ŭ����
 - InnerŬ������ Ư¡�� ������ �ֽ��ϴ�.
 - Ư�� �޼ҵ� �ȿ� ���ǵǾ��� �ִ� Ŭ���� (Ư�� �޼ҵ� �ȿ��� ������ ���������� �����ϴ�.)
 - LocalŬ������ �޼ҵ� ���� ���ǰ� �Ǿ�, �޼ҵ� �������� ��ü ������ �����մϴ�.
 
 
class OuterŬ���� {

	public void method() {
		class InnerŬ���� {
		
		}
	}
}


*/
public class LocalEx01 {
	
	public void innerTest(){
		
		class Inner {
			
			public void getData(){
				System.out.println("Local ���� Ŭ����");
			
			}
		}
		
		Inner i = new Inner();
		i.getData();
		
		
	}
	
	public static void main (String[] args) {
	
		LocalEx01 io = new LocalEx01();
		io.innerTest();
		
		
	}
	
}
