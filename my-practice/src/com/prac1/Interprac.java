package com.prac1;

interface basic {
	int chance = 7;
	String str = "kuno";
	abstract void reinforce();
}

class tt implements basic {
	
	@Override
	public void reinforce(){
		System.out.println("강화했습니다.");
	}
}

public class Interprac {

	public static void main(String[] args) {
		
		tt t = new tt();
		System.out.println(basic.chance);
		t.reinforce();

	}

}
