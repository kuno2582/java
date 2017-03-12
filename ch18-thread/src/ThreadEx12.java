/*

�������� ����ȭ ����
 - ���� �������� �� �߻� ����
 - ���� �����尡 ���ÿ� ����� �� 2�� �̻��� �����尡 ������ �����Ϳ� �����Ͽ� �۾��� ���
 	������ �߻��� �� �ִ�.
 - �ϳ��� �����尡 �����ϰ� �ִ� �����ڿ�(����, ������)�� �ٸ� �����尡 �������� ���ϵ���
 	�ϱ� ���ؼ� ����ȭ�� �ʿ䰡 �ֽ��ϴ�.
 	
 	
����ȭ(Synchronization)
 - �Ӱ迵������ ��������� ������ ���� �����ڿ��� ����ϰ� �ϴ� ���� ����ȭ��� �մϴ�.
 - �Ӱ迵��(Critical Section)�̶� ��Ƽ�����忡 ���� �����ڿ��� ���� ������ �� 
	�ִ� �ڵ��� ������ ���մϴ�.
 - ����ȭ �޼ҵ带 �����ϱ� ���ؼ� synchronizedŰ���带 ����Ͽ����ϴ�.
 - ����ȭ �޼ҵ带 �����尡 ȣ���ϰ� �Ǹ� �̹� ������ �����尡 �۾��� �Ϸ��Ҷ����� ��ٷ���
 	������ �� �ֽ��ϴ�.
 - ����ȭ�� ó���ϱ� ���ؼ� ��� ��ü�� ���� ���Խ�ŵ�ϴ�.
 

����ȭ ���
 - Ư�� ����� ����ȭ���
 - ����ȭ ����� ����� ����ϸ� ����ȭ�� ����� �Ǵ� ������ �����ϰ� ������ �� �ֽ��ϴ�.

���������� ����Ÿ�� �޼ҵ��(){
	synchronized(������ü){	//�Ӱ迵�� �ڵ�

	}
	
}

*/
class ATM implements Runnable {
	
	private long depositMoney = 10000;
	
	public void withDraw(long howMuch){
		if(depositMoney > 0){
			depositMoney -= howMuch;
			//� �����尡 �����ߴ��� ���
			System.out.println(Thread.currentThread().getName() + 
					"\t" + depositMoney);
		}else{
			System.out.println(Thread.currentThread().getName() + 
					"\t" + "�ܾ��� �����մϴ�.");
		}
	}
	
	@Override
	public void run(){
		synchronized(this){
			for(int i=0; i<5; i++){
				try{
					Thread.sleep(1000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				
				if(depositMoney <= 0){
					break;
				}
				withDraw(1000);
			}
		}
	}
}

public class ThreadEx12 {

	public static void main(String[] args) {
		
		ATM atm = new ATM();
		Thread mother = new Thread(atm, "Mother");
		mother.start();
		
		Thread son = new Thread(atm, "Son");
		son.start();

	}

}
