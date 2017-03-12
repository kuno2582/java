package com.inner3;

interface Readable5 {
	public void read();
}

class OuterClass5 {
	
	private String myName;
	
	OuterClass5(String name){
		myName = name;
	}
	
	public Readable5 createLocalClassInst(String instName){
		class LocalClass implements Readable5 {
			@Override
			public void read(){
				System.out.println("Outer instance name: " + myName);
				System.out.println("Local instance name: " + instName);
			}
		}
		
		return new LocalClass();
	}
	
}

public class LocalEx05 {

	public static void main(String[] args) {
		
		OuterClass5 out = new OuterClass5("Amanda");
		Readable5 localInst = out.createLocalClassInst("Edwin");
		localInst.read();
		
		OuterClass5 out2 = new OuterClass5("Michael");
		Readable5 localInst2 = out2.createLocalClassInst("jordan");
		localInst2.read();

	}

}
