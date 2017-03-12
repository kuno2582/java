/*

스레드의 동기화 문제
 - 다중 스레드일 때 발생 가능
 - 여러 스레드가 동시에 실행될 때 2개 이상의 스레드가 동일한 데이터에 접근하여 작업할 경우
 	문제가 발생할 수 있다.
 - 하나의 스레드가 조작하고 있는 공유자원(변수, 데이터)를 다른 스레드가 조작하지 못하도록
 	하기 위해서 동기화할 필요가 있습니다.
 	
 	
동기화(Synchronization)
 - 임계영역에서 스레드들이 순서를 갖춰 공유자원을 사용하게 하는 것을 동기화라고 합니다.
 - 임계영역(Critical Section)이란 멀티스레드에 의해 공유자원이 서로 참조될 수 
	있는 코드의 범위를 말합니다.
 - 동기화 메소드를 구현하기 위해서 synchronized키워드를 사용하였습니다.
 - 동기화 메소드를 스레드가 호출하게 되면 이미 접근한 스레드가 작업을 완료할때까지 기다려야
 	접근할 수 있습니다.
 - 동기화를 처리하기 위해서 모든 객체에 락을 포함시킵니다.
 

동기화 방법
 - 특정 블록의 동기화방법
 - 동기화 블록을 만들어 사용하면 동기화의 대상이 되는 영역을 세밀하게 제한할 수 있습니다.

접근지정자 리턴타입 메소드명(){
	synchronized(공유객체){	//임계영역 코드

	}
	
}

*/
class ATM implements Runnable {
	
	private long depositMoney = 10000;
	
	public void withDraw(long howMuch){
		if(depositMoney > 0){
			depositMoney -= howMuch;
			//어떤 쓰레드가 접근했는지 출력
			System.out.println(Thread.currentThread().getName() + 
					"\t" + depositMoney);
		}else{
			System.out.println(Thread.currentThread().getName() + 
					"\t" + "잔액이 부족합니다.");
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
