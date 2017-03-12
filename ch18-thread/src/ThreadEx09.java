
class ThreadPriority9 extends Thread {
	
	String message;
	
	public ThreadPriority9(String str, int priority){
		message = str;
		setPriority(priority);
	}
	
	@Override
	public void run(){
		for(int i=0; i<1000; i++){
			System.out.println(message + "(" + getPriority() + ")");
			try{
				sleep(1);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
		
	}
}

public class ThreadEx09 {

	public static void main(String[] args) {
		
		ThreadPriority9 th1 = new ThreadPriority9("1번째", Thread.MAX_PRIORITY);
		ThreadPriority9 th2 = new ThreadPriority9("2번째", Thread.NORM_PRIORITY);
		ThreadPriority9 th3 = new ThreadPriority9("3번째", Thread.MIN_PRIORITY);
		
		th1.start();
		th2.start();
		th3.start();

	}

}
