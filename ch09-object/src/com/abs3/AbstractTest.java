package com.abs3;

abstract class AbsEx1 {
	
	int a = 100;
	
	public int getA(){
		return a;
	}
	
	abstract public int getB();
	abstract public int getC();
	
}

abstract class AbsEx2 extends AbsEx1 {
	
	String msg = "√ﬂªÛ»≠";
	
	@Override
	public int getB(){
		return 200;
	}
	
	public abstract String getMsg();
	
}

public class AbstractTest extends AbsEx2 {
	
	@Override
	public int getC(){
		return 300;
	}
	
	@Override
	public String getMsg(){
		return msg;
	}

	public static void main(String[] args) {
		
		AbstractTest abt = new AbstractTest();
		System.out.println(abt.getA());
		System.out.println(abt.getB());
		System.out.println(abt.getC());
		System.out.println(abt.getMsg());

	}

}
