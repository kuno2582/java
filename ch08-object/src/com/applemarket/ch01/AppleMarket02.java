package com.applemarket.ch01;
/*
public class AppleMarket02 {

	public static void main(String[] args) {
		
		AppleSeller s1 = new AppleSeller();
		AppleSeller s2 = new AppleSeller();
		AppleBuyer b1 = new AppleBuyer();
		
		s1.initeSeller(0, 20, 2500);
		s2.initeSeller(0, 50, 1000);
		
		b1.buyApple(s1, 5000);
		b1.buyApple(s2, 5000);
		
		System.out.println("��� �Ǹ���1�� ���� ����");
		s1.showSaleResult();
		System.out.println("��� �Ǹ���2�� ���� ����");
		s2.showSaleResult();
		System.out.println("��� ������1�� ���� ����");
		b1.showBuyResult();

	}

}

class AppleSeller {
	int numOfApple;
	int myMoney;
	int applePrice;
	
	public int saleApple(int money){
		int num = money/applePrice;
		numOfApple -= num;
		myMoney += money;
		
		return num;
	}
	
	public void showSaleResult(){
		System.out.println("���� ���: " + numOfApple);
		System.out.println("�Ǹ� ����: " + myMoney);
	}
	public void initeSeller(int money, int appleNumber, int price){
		myMoney = money;
		numOfApple = appleNumber;
		applePrice = price;
	}
}

class AppleBuyer{
	int myMoney = 10000;
	int numOfApple = 0;
	
	public void buyApple(AppleSeller seller, int money){
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	public void showBuyResult(){
		System.out.println("�����ݾ�: " + myMoney);
		System.out.println("�������: " + numOfApple);
	}
}






*/