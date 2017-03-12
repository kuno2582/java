//join()을 안쓸경우
//메모리를 공유함에 따라 우선순위에 따라서 결과값이 다르게 나옴

class Sum {
	int num;
	
	public Sum(){
		num=0;
	}
	
	public void addNumber(int n){
		num += n;
	}
	public int getNumber(){
		return num;
	}
}

class AdderThread extends Thread {
	Sum sumInst;
	int start, end;
	
	public AdderThread(Sum sum, int s, int e){
		sumInst = sum;
		start = s;
		end = e;
		
	}
	
	@Override
	public void run(){
		for(int i=start; i<= end; i++){
			sumInst.addNumber(i);
		}
	}
}

public class ThreadEx10 {

	public static void main(String[] args) {
		
		Sum s = new Sum();
		AdderThread at1 = new AdderThread(s, 1, 50);
		AdderThread at2 = new AdderThread(s, 51, 100);
		
		at1.start();
		at2.start();
		
		try{
			at1.join();
			at2.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		

		System.out.println("1~100까지의 합: " + s.getNumber());
	}

}
