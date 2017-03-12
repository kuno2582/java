package com.abs2;

public class StarCraft {

	public static void main(String[] args) {
		
		Protoss p = new Protoss("프로토스",100,true);
		Terran t = new Terran("테란",100,false);
		Zerg z = new Zerg("저그",100,true);
		
		System.out.println("프로토스 에너지 보유량: " + p.getEnergy());
		System.out.println("테란 에너지 보유량: " + t.getEnergy());
		System.out.println("저그 에너지 보유량: " + z.getEnergy());
		
		p.decEnergy();
		t.decEnergy();
		z.decEnergy();
		
		System.out.println("프로토스 에너지 보유량: " + p.getEnergy());
		System.out.println("테란 에너지 보유량: " + t.getEnergy());
		System.out.println("저그 에너지 보유량: " + z.getEnergy());

	}

}
