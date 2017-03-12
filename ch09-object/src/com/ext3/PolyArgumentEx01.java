package com.ext3;
/*
������(Polymorphism)
 - ���� �ٸ� ��ü�� ������ ������� ����� ���� �� �ְ� �ϴ� ��
 - �̶� ���� �ٸ� ��ü���� ���� ����� ������ ������ �ٸ� ������� ����� �����ϰ� �˴ϴ�.
 - ��ü������� �ϳ��� �ڵ�� �پ��� Ÿ���� ��ü�� ó���ϰ��ϴ� ���


*/

class Product {
	int price;
	int bonusPoint;
	
	public Product(int price){
		this.price = price;
		bonusPoint = price/10;
	}
	
	public String getName(){
		return "��ǰ";
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
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p.getName() + "��(��) �����߽��ϴ�.");
	}
}

public class PolyArgumentEx01 {

	public static void main(String[] args) {
		
		Buyer buyer1 = new Buyer();
		
		Tv tv1 = new Tv();
		Computer computer = new Computer();
		Audio audio1 = new Audio();
		
		System.out.println("���� �ݾ�: " + buyer1.money + "���� �Դϴ�.");
		
		System.out.println("Ƽ�� ����: " + tv1.price + "����");
		buyer1.buy(tv1);
		System.out.println("���� �ݾ�: " + buyer1.money + "���� �Դϴ�.");
		System.out.println("���ʽ� ����Ʈ: " + buyer1.bonusPoint + "�� �Դϴ�.");
		
		System.out.println("��ǻ�� ����: " + computer.price + "����");
		buyer1.buy(computer);
		System.out.println("���� �ݾ�: " + buyer1.money + "���� �Դϴ�.");
		System.out.println("���ʽ� ����Ʈ: " + buyer1.bonusPoint + "�� �Դϴ�.");
		
		System.out.println("��ǻ�� ����: " + audio1.price + "����");
		buyer1.buy(audio1);
		System.out.println("���� �ݾ�: " + buyer1.money + "���� �Դϴ�.");
		System.out.println("���ʽ� ����Ʈ: " + buyer1.bonusPoint + "�� �Դϴ�.");
		
	}

}
