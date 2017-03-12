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
		
		//인터페이스 구현을 기반으로 로컬클래스를 정의하면
		//외부에 정의된 인터페이스의 참조변수를 통해서 인스턴스의 접근이 가능합니다.
		
		
		class LocalClass implements Readable{
			
			@Override
			public void read(){
				System.out.println("Outer inst name: " + strName);
			}
		}
		
		return new LocalClass();
	}
	
}

public class LocalEx04 {	//local클래스 사용예

	public static void main(String[] args) {
		
		OuterClass out1 = new OuterClass("KUNO is BEST!");
		Readable localInst1 = out1.createLocalClassInst();
		localInst1.read();
		
		OuterClass out2 = new OuterClass("Master Yoda");
		Readable localInst2 = out2.createLocalClassInst();
		localInst2.read();

	}

}
