/*

������ ���� ���
 - ThreadŬ������ ��ӹ޾Ƽ� run()�޼ҵ带 �������̵��ϴ� ���
 - Runnable�������̽��� �����ϴ� ���
 
 - �ٸ� Ŭ������ ��ӹ޾ƾ� �� ��� ���߻���� ���ϱ� ���� �������̽� ������� ���
 


������ �������(Runnable�������̽�)
1	implements Runnable
2	run() �������̵�
3	Runnable�������̽��� ������ Ŭ������ ��ü ����
4	������ ������ �������� ���ڷ� run() �������̵��� ��ü�� ��� 
5	start() ȣ��

*/
public class ThreadEx03 implements Runnable {
	
	@Override
	public void run(){
		for(int i=0; i<10; i++){
			
			try{
				Thread.sleep(1000);	//ThreadŬ���� �ȿ� static���� ����Ǿ� �ִ� �޼���
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
			System.out.print("Thread Name: " + Thread.currentThread().getName() + "\t");
			System.out.println("temp value: " + i);
		}
	}

	public static void main(String[] args) {
		
		ThreadEx03 td = new ThreadEx03();
		
		//Thread t = new Thread(td);
		Thread t = new Thread(td, "�ι�°");
		t.start();

	}

}
