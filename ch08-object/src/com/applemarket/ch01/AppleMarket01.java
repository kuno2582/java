/*package com.applemarket.ch01;

//��� ���� �м�(��ü, ����, �޼ҵ� �м�)
//Ŭ����				AppleSeller		AppleBuyer
//��ü				����Ǹ���			���������
//----------------------------------------
//����				��� ����			��� ����
//(������, �Ӽ�)		��� ����			���� �ݾ�
//					�Ǹ� ����
//�޼ҵ�				����� �Ǵ�.		����� ���.
//(���, ����)

public class AppleMarket01 {

	public static void main(String[] args) {
		
		AppleSeller s1 = new AppleSeller();
		AppleBuyer b1 = new AppleBuyer();
		
		System.out.println("�ŷ� �� ����");
		
		s1.showSaleResult();
		b1.showBuyResult();
		
		b1.buyApple(s1,2000);
		
		System.out.println("");
		System.out.println("�ŷ� �� ����");
		
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
		System.out.println("���� ���: " + numOfApple);
		System.out.println("�Ǹ� ����: " + myMoney);
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
		System.out.println("���� ���: " + numOfApple);
		System.out.println("���� �ݾ�: " + myMoney);
	}
	
}
*/