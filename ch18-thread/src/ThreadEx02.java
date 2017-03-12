
public class ThreadEx02 extends Thread {

	String tname;
	
	public ThreadEx02(String name){
		tname = name;
	}
	
	@Override
	public void run(){
		
		while(true){
			
			try{
				sleep(500);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(tname);
		}
	}
	
	public static void main(String[] args) {
		
		ThreadEx02 td = new ThreadEx02("첫번째");
		ThreadEx02 td2 = new ThreadEx02("두번째");
		td.start();
		td2.start();

	}

}
