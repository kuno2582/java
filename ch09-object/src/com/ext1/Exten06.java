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
		System.out.println("�����ݾ�: " + balance);
	}
}

public class Exten06 {

	public static void main(String[] args) {
		
		Money money = new Money();
		SaveMoney saveMoney = new SaveMoney();
		
		//�θ�ü�� ���� ��������
		saveMoney.showMoney();
		money.addMoney(1000);
		saveMoney.showMoney();
		saveMoney.saveMoney(2000);
		saveMoney.showMoney();
		
		//�ڽ�Ŭ������ ���� ��������
		SaveMoney.balance += 500;
		saveMoney.showMoney();
		
		//�θ�Ŭ������ ���� ��������
		Money.balance += 20;
		saveMoney.showMoney();
		
		//money.balance += 10000;	��õ���� �ʴ� static ���ٹ��
		//saveMoney.showMoney();
		
	}

}
