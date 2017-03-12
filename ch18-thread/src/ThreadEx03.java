/*

쓰레드 생성 방법
 - Thread클래스를 상속받아서 run()메소드를 오버라이드하는 방식
 - Runnable인터페이스를 구현하는 방식
 
 - 다른 클래스를 상속받아야 할 경우 다중상속을 피하기 위해 인터페이스 구현방식 사용
 


쓰레드 생성방법(Runnable인터페이스)
1	implements Runnable
2	run() 오버라이드
3	Runnable인터페이스를 구현한 클래스의 객체 생성
4	스레드 생성시 생성자의 인자로 run() 오버라이드한 객체를 등록 
5	start() 호출

*/
public class ThreadEx03 implements Runnable {
	
	@Override
	public void run(){
		for(int i=0; i<10; i++){
			
			try{
				Thread.sleep(1000);	//Thread클래스 안에 static으로 선언되어 있는 메서드
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
		Thread t = new Thread(td, "두번째");
		t.start();

	}

}
