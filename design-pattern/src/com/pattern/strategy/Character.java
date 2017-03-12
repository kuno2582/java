package com.pattern.strategy;

public class Character {
	
	private Weapon weapon;
	
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack() {

		weapon.attack();

	}
	
}
