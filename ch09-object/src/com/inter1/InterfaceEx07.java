package com.inter1;

interface Interf1 {
	public int getA();
}

interface Interf2 {
	public int getA();
}

interface Interf3 extends Interf1, Interf2 {
	public int getData();
}

public class InterfaceEx07 implements Interf3 {

	int a = 100;
	
	@Override
	public int getA(){
		return a;
	}
	
	@Override
	public int getData(){
		return a + 10;
	}
	
	public static void main(String[] args) {
		
		InterfaceEx07 ife = new InterfaceEx07();
		Interf1 it1 = ife;
		Interf2 it2 = ife;
		Interf3 it3 = ife;
		
		System.out.println(it1.getA());
		System.out.println(it2.getA());
		System.out.println(it3.getData());

	}

}
