package com.ext1;
/*

private 멤버변수 상속
 - 상속시 부모클래스의 private멤버변수도 상속이 됩니다.
 - 하지만 함께 상속된 메소드를 통해서만 간접적으로 접근이 가능합니다.

*/
class Bank{
	
	private int balance;	//자식클래스에 상속할 수 있지만 직접접근은 불가하다
	
	Bank(int init){
		balance = init;
	}
	
	protected void accumulate(int number){
		if(number < 0)
			return;
		balance += number;
	}
	
	protected int getBalance(){
		return balance;
	}
}

class SaveAccount extends Bank {
	
	public SaveAccount(int initDeposit){
		super(initDeposit);
	}
	
	public void saveMoney(int money){
		accumulate(money);
	}
	
	public void showMoney(){
		System.out.print("누적 금액: ");
		System.out.println(getBalance());
	}
	
}

public class Exten05 {

	public static void main(String[] args) {
		
		SaveAccount sa = new SaveAccount(5000);
		sa.saveMoney(100000);
		sa.saveMoney(100000);
		sa.showMoney();

	}

}
