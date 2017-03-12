package com.inner3;

public class LocalEx03 {
	
	int a = 300;
	
	public void innerTest(int k){
		
		final int b= 200;	//������ ���� final �Ⱥٿ��� ��� ������ �� �� ����
		
		final int c = k;
		
		class Inner {
			
			public void getData(){
				
				//�ܺ�Ŭ������ ������� ȣ��
				System.out.println("int a: " + a);
				
				//Local ����Ŭ������ �����ϰ� �ִ� �޼ҵ��� �������� ȣ��
				//Local ����Ŭ������ ���������� ����� �� �ֽ��ϴ�.
				System.out.println("int b: " + b);
				
				System.out.println("final int c: " + c);
			}
		}
		
		Inner in = new Inner();
		in.getData();
		
	}

	public static void main(String[] args) {
		
		LocalEx03 lo = new LocalEx03();
		lo.innerTest(1000);

	}

}
