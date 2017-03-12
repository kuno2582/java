package com.abs2;

public abstract class Unit {
	
	protected String name;
	protected int energy;
	
	abstract public void decEnergy();
	abstract public void incEnergy();
	
	public int getEnergy(){
		return energy;
	}

}
