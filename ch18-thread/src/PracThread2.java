import java.util.Scanner;

class ThreadEx extends Thread {
	
	Scanner scan = new Scanner(System.in);
	int i;
	
	@Override
	public void run(){
		try{
			sleep(2000);
			i = scan.nextInt();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}

public class PracThread2 {

	public static void main(String[] args) {
		
		

	}

}
