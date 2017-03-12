package com.inner1;

class OuterClass {
	
	private String name;
	private int num;
	
	OuterClass(String name){
		this.name = name;
		num = 0;
	}
	
	public void whatYourName(){
		num++;
		System.out.println("My name is " + name + " : Outer Class: " + num);
	}
	
	class InnerClass {
		InnerClass(){
			whatYourName();
		}
	}
	
}

public class MemberEx03 {

	public static void main(String[] args) {
		
		OuterClass out1 = new OuterClass("Alice");
		OuterClass out2 = new OuterClass("Jacob");
		
		out1.whatYourName();
		out2.whatYourName();
		
		OuterClass.InnerClass inner1 = out1.new InnerClass();
		OuterClass.InnerClass inner2 = out2.new InnerClass();
		OuterClass.InnerClass inner3 = out1.new InnerClass();
		OuterClass.InnerClass inner4 = out2.new InnerClass();
		OuterClass.InnerClass inner5 = out1.new InnerClass();
		OuterClass.InnerClass inner6 = out2.new InnerClass();
		
		System.out.println(inner1);
		System.out.println(inner2);
		System.out.println(inner3);
		System.out.println(inner4);
		System.out.println(inner5);
		System.out.println(inner6);
		
	}

}
