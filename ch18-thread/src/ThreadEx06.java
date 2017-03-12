
//�켱������ ������ �ϴ� ���� �޼���

class MyRunnableOne implements Runnable {
	
	@Override
	public void run(){
		System.out.println("run");
		first();
	}
	
	public void first(){
		System.out.println("First");
		second();
	}
	
	public void second(){
		System.out.println("Second");
	}
}

public class ThreadEx06 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName() + "\t ù��° ���");
		System.out.println(Thread.currentThread().getName() + "\t �ι�° ���");
		
		MyRunnableOne mro = new MyRunnableOne();
		
		Thread t = new Thread(mro);
		t.start();
		
		try{
			t.join();	//�켱������ ���ϴ� join�޼���
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + "\t ����° ���");
		System.out.println(Thread.currentThread().getName() + "\t �׹�° ���");

	}

}
