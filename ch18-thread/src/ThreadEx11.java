/*
����ȭ ���
 - �޼ҵ� ����ȭ ���
 - Ư�� ����� ����ȭ ���
 
�޼ҵ� ����ȭ���
 - synchronized �����ؼ� synchronizedMethod�� �����忡 ������ �Լ��� �˴ϴ�.
 - ���� ���Ұ� ������ �˴ϴ�. ����� ȣ���� ���ɿ� ������ �ǹǷ� �������̸� �����մϴ�.
 
���������� synchronized ����Ÿ�� �޼ҵ��(){

}

*/
class SharedData {
	int data;
	
	public synchronized void up(String name){	//name�� ���� �������״��� Ȯ���ϴ� �뵵
		System.out.print(name + ":" + data);
		data++;
		System.out.println("�� " + data + "�� ������Ŵ");
	}
	
	public synchronized void down(String name){	//�Ӱ迵��
		System.out.print(name + ":" + data);
		data--;
		System.out.println("�� " + data + "�� ���ҽ�Ŵ");
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
