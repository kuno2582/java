package com.inner2;
/*

NestedClass (��øŬ����)
 - Ŭ���� �ȿ� Ŭ������ ����Ǵ� ��

*/
class OuterClass {
	
	OuterClass(){
		NestedClass nc = new NestedClass();	//�ܺ�Ŭ������ �����Ǹ� �ڵ����� ����Ŭ���� ����
		nc.getData();
	}
	
	static class NestedClass{
		
		public void getData(){
			System.out.println("Nested Instance Method");
		}
	}
	
}

public class StaticEx02 {

	public static void main(String[] args) {
		
		OuterClass ot = new OuterClass();
		
		OuterClass.NestedClass ocnc = new OuterClass.NestedClass();
		//OuterClass.NestedClass ocnc = ot.new NestedClass();
		ocnc.getData();
		
		System.out.println(ot);
		
//		OuterClass.NestedClass ocnc2 = ot.new NestedClass(); �̷��Դ� �Ұ��ϴ�
		

	}

}
