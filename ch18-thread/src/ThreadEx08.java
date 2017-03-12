
class ThreadPriority extends Thread {
	
	String message;
	
	ThreadPriority(String str, int priority){
		message = str;
		setPriority(priority);
	}
	
	@Override
	public void run(){
		for(int i=0; i<1000; i++){
			System.out.println(message + "(" + getPriority() + ")");
		}
	}
}

public class ThreadEx08 {

	public static void main(String[] args) {
		
		ThreadPriority tp1 = new ThreadPriority("First", Thread.MAX_PRIORITY);
		ThreadPriority tp2 = new ThreadPriority("Second", Thread.NORM_PRIORITY);
		ThreadPriority tp3 = new ThreadPriority("Third", Thread.MIN_PRIORITY);
		tp1.start();
		tp2.start();
		tp3.start();

	}

}
