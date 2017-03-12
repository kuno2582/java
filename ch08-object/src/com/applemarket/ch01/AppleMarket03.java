package com.applemarket.ch01;

public class AppleMarket03 {

	public static void main(String[] args) {
		
		AppleSeller s1 = new AppleSeller(0, 20, 2500);
		AppleSeller s2 = new AppleSeller(0, 50, 1000);
		AppleBuyer b1 = new AppleBuyer();
		
		b1.buyApple(s1,5000);
		b1.buyApple(s2,5000);
		
		System.out.println("판매자1의 상태");
		s1.showSaleResult();
		System.out.println("판매자2의 상태");
		s2.showSaleResult();
		System.out.println("구매자1의 상태");
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
		
		return num;		//구매자에게도 구매사과개수를 알려줘야하기때문에 return값 있음
	}
	
	public void showSaleResult(){
		System.out.println("보유 사과: " + numOfApple);
		System.out.println("판매 수익: " + myMoney);
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
		System.out.println("보유금액: " + myMoney);
		System.out.println("사과개수: " + numOfApple);
	}
}
