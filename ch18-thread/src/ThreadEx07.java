/*
������ �����층 ���
������ ������ �����층 ���: �������� �켱���� ������ �켱������ ���� �����带 ���� �����ϴ� ���

������ �����췯
��Ƽ �����尡 ����� �� � �����尡 ���� ��������� ������ �ݴϴ�.

������ �켱����
�켱������ ���� �����尡 �켱 ����˴ϴ�.
�켱������ ������ ��쿡�� CPU�� �Ҵ�ð��� ������ �����ϴ�.
setPriority(int priority)	//1~10������ ���� ����


static int MAX_PRIORITY		10	:	�ִ� �켱����
static int NORM_PRIORITY		5	:	�⺻ �켱����
static int MIN_PRIORITY		1	:	�ּ� �켱����

*/
class ThreadTest01 extends Thread {
	@Override
	public void run(){
		for(int i=0; i<300; i++){
			System.out.println("-");
		}
	}
}

class ThreadTest02 extends Thread {
	@Override
	public void run(){
		for(int i=0; i<300; i++){
			System.out.println("*");
		}
	}
}

public class ThreadEx07 {

	public static void main(String[] args) {
		
		ThreadTest01 th1 = new ThreadTest01();
		ThreadTest02 th2 = new ThreadTest02();
		
		th1.setPriority(5);
		th2.setPriority(7);
		
		System.out.println("th1: " + th1.getPriority());
		System.out.println("th2: " + th2.getPriority());
		
		th1.start();
		th2.start();

	}

}
