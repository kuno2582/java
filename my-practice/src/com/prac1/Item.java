package com.prac1;

import java.util.Random;

class Base {
	private String name;
	private int price;
	private int durability;
	private int chanceReinforce;
	
	public void setName(String name){
		this.name = name;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public void setDurability(int durability){
		this.durability = durability;
	}
	public void setChanceReinforce(int chanceReinforce){
		this.chanceReinforce = chanceReinforce;
	}
	
	public void showItemInfo(){
		System.out.print("아이템명: " + name + "\t");
		System.out.print("가격: " + price + "\t");
		System.out.print("내구: " + durability + "\t");
		System.out.print("강화횟수: " + chanceReinforce + "\t");
	}
}

class Sword extends Base{
	private int attack;
	public void setAttack(int attack){
		this.attack = attack;
	}
	
	@Override
	public void showItemInfo(){
		super.showItemInfo();
		System.out.println("공격력: " + attack);
	}
}

class NormalSword extends Sword {
	NormalSword(){
		setName("노말검");
		setPrice(2000);
		setDurability(50);
		setChanceReinforce(7);
		setAttack(100);
	}
}

class MagicSword extends Sword {
	MagicSword(){
		setName("마법검");
		setPrice(10000);
		setDurability(50);
		setChanceReinforce(7);
		setAttack(250);
	}
}

class UniqueSword extends Sword {
	UniqueSword(){
		setName("유닉검");
		setPrice(100000);
		setDurability(50);
		setChanceReinforce(7);
		setAttack(1000);
	}
}

public class Item {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Sword [] arr = new Sword[20];
		
		for(int i=0; i<arr.length; i++){
			int ranResult = ran.nextInt(10);
			if(ranResult<=1){
				arr[i] = new UniqueSword();
				arr[i].showItemInfo();
			}else if((ranResult>1) && (ranResult<=4)){
				arr[i] = new MagicSword();
				arr[i].showItemInfo();
			}else{
				arr[i] = new NormalSword();
				arr[i].showItemInfo();
			}
		}
		

	}

}
