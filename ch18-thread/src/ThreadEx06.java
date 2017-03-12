
//우선순위를 가지게 하는 조인 메서드

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
		
		System.out.println(Thread.currentThread().getName() + "\t 첫번째 출력");
		System.out.println(Thread.currentThread().getName() + "\t 두번째 출력");
		
		MyRunnableOne mro = new MyRunnableOne();
		
		Thread t = new Thread(mro);
		t.start();
		
		try{
			t.join();	//우선순위를 정하는 join메서드
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + "\t 세번째 출력");
		System.out.println(Thread.currentThread().getName() + "\t 네번째 출력");

	}

}
