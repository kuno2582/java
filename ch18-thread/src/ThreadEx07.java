/*
스레드 스케쥴링 방식
선정형 스레드 스케쥴링 방식: 스레드의 우선권을 가지고 우선순위가 높은 스레드를 먼저 수행하는 방식

스레드 스케쥴러
멀티 스레드가 수행될 때 어떤 스레드가 먼저 수행될지를 결정해 줍니다.

스레드 우선순위
우선순위가 높은 스레드가 우선 실행됩니다.
우선순위가 동일한 경우에는 CPU의 할당시간을 나누어 갖습니다.
setPriority(int priority)	//1~10사이의 값을 가짐


static int MAX_PRIORITY		10	:	최대 우선순위
static int NORM_PRIORITY		5	:	기본 우선순위
static int MIN_PRIORITY		1	:	최소 우선순위

*/
class ThreadTest01 extends Thread {
	@Override
	public void run(){
		for(int i=0; i<300; i++){
			System.out.println("-");
		}
	}
}

class ThreadTest02 extends Thread {
	@Override
	public void run(){
		for(int i=0; i<300; i++){
			System.out.println("*");
		}
	}
}

public class ThreadEx07 {

	public static void main(String[] args) {
		
		ThreadTest01 th1 = new ThreadTest01();
		ThreadTest02 th2 = new ThreadTest02();
		
		th1.setPriority(5);
		th2.setPriority(7);
		
		System.out.println("th1: " + th1.getPriority());
		System.out.println("th2: " + th2.getPriority());
		
		th1.start();
		th2.start();

	}

}
