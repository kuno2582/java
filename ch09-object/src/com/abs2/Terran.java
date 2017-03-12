package com.abs2;

public class Terran extends Unit{
	
	boolean fly;
	public Terran(String name, int energy, boolean fly){
		this.name = name;
		this.energy = energy;
		this.fly = fly;
	}
	
	@Override
	public void decEnergy(){
		energy -= 2;
	}
	
	@Override
	public void incEnergy(){
		energy += 2;
	}
}
