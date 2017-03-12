package com.applemarket.ch01;

public class AppleMarket03 {

	public static void main(String[] args) {
		
		AppleSeller s1 = new AppleSeller(0, 20, 2500);
		AppleSeller s2 = new AppleSeller(0, 50, 1000);
		AppleBuyer b1 = new AppleBuyer();
		
		b1.buyApple(s1,5000);
		b1.buyApple(s2,5000);
		
		System.out.println("�Ǹ���1�� ����");
		s1.showSaleResult();
		System.out.println("�Ǹ���2�� ����");
		s2.showSaleResult();
		System.out.println("������1�� ����");
		b1.showBuyResult();

	}

}

class AppleSeller {
	
	int numOfApple;
	int myMoney;
	final int APPLE_PRICE;
	
	public AppleSeller(int money, int appleNumber, int price){
		numOfApple = appleNumber;
		myMoney = money;
		APPLE_PRICE = price;
	}
	
	public int saleApple(int money){
		int num = money/APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		
		return num;		//�����ڿ��Ե� ���Ż�������� �˷�����ϱ⶧���� return�� ����
	}
	
	public void showSaleResult(){
		System.out.println("���� ���: " + numOfApple);
		System.out.println("�Ǹ� ����: " + myMoney);
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
