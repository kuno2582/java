package com.abs2;

public class StarCraft {

	public static void main(String[] args) {
		
		Protoss p = new Protoss("�����佺",100,true);
		Terran t = new Terran("�׶�",100,false);
		Zerg z = new Zerg("����",100,true);
		
		System.out.println("�����佺 ������ ������: " + p.getEnergy());
		System.out.println("�׶� ������ ������: " + t.getEnergy());
		System.out.println("���� ������ ������: " + z.getEnergy());
		
		p.decEnergy();
		t.decEnergy();
		z.decEnergy();
		
		System.out.println("�����佺 ������ ������: " + p.getEnergy());
		System.out.println("�׶� ������ ������: " + t.getEnergy());
		System.out.println("���� ������ ������: " + z.getEnergy());

	}

}
