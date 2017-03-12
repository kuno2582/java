/*package com.applemarket.ch01;

//사과 마켓 분석(객체, 변수, 메소드 분석)
//클래스				AppleSeller		AppleBuyer
//객체				사과판매자			사과구매자
//----------------------------------------
//변수				사과 개수			사과 개수
//(데이터, 속성)		사과 가격			보유 금액
//					판매 수익
//메소드				사과를 판다.		사과를 산다.
//(기능, 행위)

public class AppleMarket01 {

	public static void main(String[] args) {
		
		AppleSeller s1 = new AppleSeller();
		AppleBuyer b1 = new AppleBuyer();
		
		System.out.println("거래 전 상태");
		
		s1.showSaleResult();
		b1.showBuyResult();
		
		b1.buyApple(s1,2000);
		
		System.out.println("");
		System.out.println("거래 후 상태");
		
		s1.showSaleResult();
		b1.showBuyResult();

	}

}

class AppleSeller{
	int numOfApple = 30;
	final int APPLE_PRICE = 1000;
	int myMoney = 0;
	
	public int saleApple(int money){
		int num = money/APPLE_PRICE;
		
		myMoney += money;
		numOfApple -= num;
		
		return num;
	}
	
	public void showSaleResult(){
		System.out.println("보유 사과: " + numOfApple);
		System.out.println("판매 수익: " + myMoney);
	}
	
}

class AppleBuyer{
	int numOfApple = 0;
	int myMoney = 10000;
	
	public void buyApple(AppleSeller seller, int money){
		
		numOfApple += seller.saleApple(money);
		myMoney -= money;
		
	}
	
	public void showBuyResult(){
		System.out.println("보유 사과: " + numOfApple);
		System.out.println("보유 금액: " + myMoney);
	}
	
}
*/