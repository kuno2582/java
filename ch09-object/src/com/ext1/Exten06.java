package com.ext1;

class Money {
	public static int balance = 0;
	
	void addMoney(int num){
		balance += num;
	}
	
}

class SaveMoney extends Money {
	
	public void saveMoney(int money){
		balance += money;
	}
	
	public void showMoney(){
		System.out.println("누적금액: " + balance);
	}
}

public class Exten06 {

	public static void main(String[] args) {
		
		Money money = new Money();
		SaveMoney saveMoney = new SaveMoney();
		
		//부모객체를 통해 간접접근
		saveMoney.showMoney();
		money.addMoney(1000);
		saveMoney.showMoney();
		saveMoney.saveMoney(2000);
		saveMoney.showMoney();
		
		//자식클래스를 통해 직접접근
		SaveMoney.balance += 500;
		saveMoney.showMoney();
		
		//부모클래스를 통해 직접접근
		Money.balance += 20;
		saveMoney.showMoney();
		
		//money.balance += 10000;	추천하지 않는 static 접근방식
		//saveMoney.showMoney();
		
	}

}
