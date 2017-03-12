package com.pattern.strategy;

public class Main {

	public static void main(String[] args) {

		Character kuno = new Character();
		
		kuno.setWeapon(new Knife());		
		kuno.attack();
		
		kuno.setWeapon(new Spear());
		kuno.attack();
		
	}
}
