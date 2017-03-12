package com.abs2;

public class Zerg extends Unit{

	boolean fly;
	
	public Zerg(String name, int energy, boolean fly){
		this.name = name;
		this.energy = energy;
		this.fly = fly;
	}
	
	@Override
	public void decEnergy(){
		energy -= 4;
	}
	
	@Override
	public void incEnergy(){
		energy += 4;
	}
	
}
