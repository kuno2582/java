/*

Thread(������, ������)
 - �ڹ����α׷����� ���� �κ��� �����մϴ�.
 - ���μ����� �������� ���α׷��� �ǹ��Ѵ�.
 - �ü�������� �����带 ��� �׸��� �ش��Ѵ�.
 - ������� ���μ��� ������ ������ ����ȣ���� ������ ����̴�.
 - �� ���μ��� ������ �� �̻��� �����带 ������ �� �ֽ��ϴ�.
 - ������� ��� ��(Task)�� �⺻ ����(�۾������췯�� ���� �ð��� �Ҵ�޾� cpu���� �۾��� �� �ִ�
  	�ּ� �⺻ ������ �ǹ�)�Ѵ�.
 - main()�޼ҵ带 ȣ���ϴ� �͵� ���μ��� ������ �Բ� �����Ǵ� main�����尡 ��������ش�.
 - �ϳ��� ���ø����̼��� ����Ǳ� ���ؼ��� �ּ��ϳ��� �����尡 �ʿ��ϸ�, ������� ���α׷� �ڵ带 �����ϴ�
 	������ �˴ϴ�.
 	
 	
������ ���� ���� (5�ܰ�)
1	Thread ���
2	������ �̸� ����
3	�������� run()�� ������
4	������ ��ü ����
6	start() ȣ��


*/
public class ThreadEx01 extends Thread {
	
	public ThreadEx01(String threadName){	//���ڿ��� ���������ڷ� �������� �̸��� ������
		super(threadName);
	}
	
	@Override
	public void run(){	//�������� ���θ޼���, �������� ������
		
		for(int i=0; i<10 ; i++){
			try{
				sleep(1000);	//interupt�߻� �� �� �־ ����ó������
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			//currentThread() : ���� ������ ���� ������
			System.out.println("������ �̸�: " + currentThread().getName() + "\t");
			System.out.println("temp value: " + i);
		}
		
	}

	public static void main(String[] args) {
		
		ThreadEx01 td = new ThreadEx01("ù��°");
		td.start();
		

	}

}
