/*
동기화 방법
 - 메소드 동기화 방법
 - 특정 블록의 동기화 방법
 
메소드 동기화방법
 - synchronized 선언해서 synchronizedMethod는 쓰레드에 안전한 함수가 됩니다.
 - 성능 감소가 동반이 됩니다. 빈번한 호출은 성능에 문제가 되므로 가급적이면 자제합니다.
 
접근지정자 synchronized 리턴타입 메소드명(){

}

*/
class SharedData {
	int data;
	
	public synchronized void up(String name){	//name은 누가 증가시켰는지 확인하는 용도
		System.out.print(name + ":" + data);
		data++;
		System.out.println("을 " + data + "로 증가시킴");
	}
	
	public synchronized void down(String name){	//임계영역
		System.out.print(name + ":" + data);
		data--;
		System.out.println("을 " + data + "로 감소시킴");
	}
}

class UpThread extends Thread {
	SharedData data;
	String name;
	
	public UpThread(SharedData data, String name){
		this.data = data;
		this.name = name;
	}
	
	@Override
	public void run(){
		for(int i=0; i<4; i++){
			try{
				sleep(500);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
			data.up(name);
		}
	}
}

class DownThread extends Thread {
	SharedData data;
	String name;
	
	public DownThread(SharedData data, String name){
		this.data = data;
		this.name = name;
	}
	
	@Override
	public void run(){
		for(int i=0; i<4; i++){
			try{
				sleep(500);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
			data.down(name);
		}
	}
}

public class ThreadEx11 {

	public static void main(String[] args) {
		
		SharedData sd = new SharedData();
		UpThread uth = new UpThread(sd, "UP");
		DownThread dth = new DownThread(sd, "DOWN");
		
		uth.start();
		dth.start();

	}

}
