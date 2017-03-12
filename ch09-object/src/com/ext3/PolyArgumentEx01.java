package com.ext3;
/*
다형성(Polymorphism)
 - 서로 다른 객체를 동일한 방식으로 명령을 내릴 수 있게 하는 것
 - 이때 서로 다른 객체들은 같은 명령을 받지만 제각기 다른 방식으로 명령을 수행하게 됩니다.
 - 객체지향언어에서 하나의 코드로 다양한 타입의 객체를 처리하게하는 기술


*/

class Product {
	int price;
	int bonusPoint;
	
	public Product(int price){
		this.price = price;
		bonusPoint = price/10;
	}
	
	public String getName(){
		return "상품";
	}
}

class Tv extends Product{
	public Tv(){
		super(100);
	}
	
	@Override
	public String getName(){
		return "TV";
	}
}

class Computer extends Product {
	public Computer(){
		super(200);
	}
	
	@Override
	public String getName(){
		return "Computer";
	}
}

class Audio extends Product {
	public Audio(){
		super(50);
	}
	@Override
	public String getName(){
		return "Audio";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	public void buy(Product p){
		if(money < p.price){
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p.getName() + "을(를) 구입했습니다.");
	}
}

public class PolyArgumentEx01 {

	public static void main(String[] args) {
		
		Buyer buyer1 = new Buyer();
		
		Tv tv1 = new Tv();
		Computer computer = new Computer();
		Audio audio1 = new Audio();
		
		System.out.println("보유 금액: " + buyer1.money + "만원 입니다.");
		
		System.out.println("티비 구매: " + tv1.price + "만원");
		buyer1.buy(tv1);
		System.out.println("보유 금액: " + buyer1.money + "만원 입니다.");
		System.out.println("보너스 포인트: " + buyer1.bonusPoint + "점 입니다.");
		
		System.out.println("컴퓨터 구매: " + computer.price + "만원");
		buyer1.buy(computer);
		System.out.println("보유 금액: " + buyer1.money + "만원 입니다.");
		System.out.println("보너스 포인트: " + buyer1.bonusPoint + "점 입니다.");
		
		System.out.println("컴퓨터 구매: " + audio1.price + "만원");
		buyer1.buy(audio1);
		System.out.println("보유 금액: " + buyer1.money + "만원 입니다.");
		System.out.println("보너스 포인트: " + buyer1.bonusPoint + "점 입니다.");
		
	}

}
