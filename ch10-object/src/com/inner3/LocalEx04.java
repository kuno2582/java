package com.inner3;

interface Readable {
	public void read();
}

class OuterClass {
	
	private String strName;
	
	OuterClass(String name){
		strName = name;
	}
	
	public Readable createLocalClassInst(){
		
		//�������̽� ������ ������� ����Ŭ������ �����ϸ�
		//�ܺο� ���ǵ� �������̽��� ���������� ���ؼ� �ν��Ͻ��� ������ �����մϴ�.
		
		
		class LocalClass implements Readable{
			
			@Override
			public void read(){
				System.out.println("Outer inst name: " + strName);
			}
		}
		
		return new LocalClass();
	}
	
}

public class LocalEx04 {	//localŬ���� ��뿹

	public static void main(String[] args) {
		
		OuterClass out1 = new OuterClass("KUNO is BEST!");
		Readable localInst1 = out1.createLocalClassInst();
		localInst1.read();
		
		OuterClass out2 = new OuterClass("Master Yoda");
		Readable localInst2 = out2.createLocalClassInst();
		localInst2.read();

	}

}
