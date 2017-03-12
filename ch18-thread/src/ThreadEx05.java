import java.awt.Frame;

public class ThreadEx05 extends Frame implements Runnable {
	
	@Override
	public void run(){
		for(int i=0; i<10; i++){
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("Thread Name: " 
				+ Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		
		ThreadEx05 td = new ThreadEx05();
		
		Thread t1 = new Thread(td, "ù��° 1");
		t1.start();

		Thread t2 = new Thread(td, "�ι�° 2");
		t2.start();
		
		Thread t3 = new Thread(td, "����° 3");
		t3.start();
		
		Thread t4 = new Thread(td, "�׹�° 4");
		t4.start();
	}

}
