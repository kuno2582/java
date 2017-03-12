package com.ext3;
/*

�������̵�(Overriding) 			vs 	�����ε�(Overloading)

������(�����)						��������		

��Ӱ���								Ư��Ŭ����

superŬ�����޼ҵ庸��					�������
subŬ������ �޼ҵ� ���������� �����ϰų� 
�� �о���մϴ�.

��ȯ�� ���ƾ��մϴ�.						�������

�޼ҵ�� �Ȱ��ƾ��Ѵ�.					�޼ҵ�� �Ȱ��ƾ��Ѵ�.

���� ���ƾ��Ѵ�.							�޶���Ѵ�.

*/

class AClass {
	
	public void rideMethod(){
		System.out.println("AClass's Method");
	}
	
	public void loadMethod(){
		System.out.println("void Method");
	}
	
}

class BClass extends AClass{
	
	@Override
	public void rideMethod(){
		System.out.println("BClass's Method");
	}
	
	public void loadMethod(int num){
		System.out.println("int Method");
	}
}

class CClass extends BClass{
	
	@Override
	public void rideMethod(){
		System.out.println("CClass's Method");
	}
	
	public void loadMethod(double num){
		System.out.println("double Method");
	}
	
}

public class OverridingEx03 {

	public static void main(String[] args) {
		
		AClass ref1 = new CClass();
		BClass ref2 = new CClass();
		CClass ref3 = new CClass();
		
		ref1.rideMethod();
		ref2.rideMethod();
		ref3.rideMethod();

		ref3.loadMethod();
		ref3.loadMethod(1);
		ref3.loadMethod(1.1);
	}

}
