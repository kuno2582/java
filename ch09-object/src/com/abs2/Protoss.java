package com.abs2;

public class Protoss extends Unit {
	boolean fly;
	
	public Protoss(String name, int energy, boolean fly){
		this.name = name;
		this.energy = energy;
		this.fly = fly;
	}
	
	@Override
	public void decEnergy(){
		energy--;
	}
	@Override
	public void incEnergy(){
		energy++;
	}
}
