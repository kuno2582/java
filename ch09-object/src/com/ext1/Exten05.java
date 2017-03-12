package com.ext1;
/*

private ������� ���
 - ��ӽ� �θ�Ŭ������ private��������� ����� �˴ϴ�.
 - ������ �Բ� ��ӵ� �޼ҵ带 ���ؼ��� ���������� ������ �����մϴ�.

*/
class Bank{
	
	private int balance;	//�ڽ�Ŭ������ ����� �� ������ ���������� �Ұ��ϴ�
	
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
		System.out.print("���� �ݾ�: ");
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
