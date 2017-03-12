/*

Thread(스레드, 쓰레드)
 - 자바프로그램에서 많은 부분을 차지합니다.
 - 프로세스는 실행중인 프로그램을 의미한다.
 - 운영체제적으로 스레드를 담는 그릇에 해당한다.
 - 쓰레드는 프로세스 내에서 별도의 실행호흡을 가지는 대상이다.
 - 한 프로세스 내에는 둘 이상의 스레드를 생성할 수 있습니다.
 - 쓰레드는 모든 일(Task)의 기본 단위(작업스케쥴러에 의해 시간을 할당받아 cpu에서 작업할 수 있는
  	최소 기본 단위를 의미)한다.
 - main()메소드를 호출하는 것도 프로세스 생성시 함께 생성되는 main스레드가 실행시켜준다.
 - 하나의 어플리케이션이 실행되기 위해서는 최소하나의 쓰레드가 필요하며, 쓰레드는 프로그램 코드를 실행하는
 	단위가 됩니다.
 	
 	
스레드 생성 순서 (5단계)
1	Thread 상속
2	스레드 이름 지정
3	스레드의 run()을 재정의
4	스레드 객체 생성
6	start() 호출


*/
public class ThreadEx01 extends Thread {
	
	public ThreadEx01(String threadName){	//문자열을 생성자인자로 쓰레드의 이름을 지어줌
		super(threadName);
	}
	
	@Override
	public void run(){	//스레드의 메인메서드, 스레드의 진입점
		
		for(int i=0; i<10 ; i++){
			try{
				sleep(1000);	//interupt발생 할 수 있어서 예외처리해줌
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			//currentThread() : 현재 스레드 정보 가져옴
			System.out.println("스레드 이름: " + currentThread().getName() + "\t");
			System.out.println("temp value: " + i);
		}
		
	}

	public static void main(String[] args) {
		
		ThreadEx01 td = new ThreadEx01("첫번째");
		td.start();
		

	}

}
