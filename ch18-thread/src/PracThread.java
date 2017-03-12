import java.util.Scanner;

class TimeCheck extends Thread {

	ScanReader sr;
	long startTime = System.currentTimeMillis();
	long duration;

	public TimeCheck(ScanReader sr, long duration) {

		this.sr = sr;
		this.duration = duration;
		startTime = System.currentTimeMillis();

	}

	@Override
	public void run() {
		while ((System.currentTimeMillis() - startTime) < duration) {
		}
		ScanReader.bl = false;
		System.out.println(duration / 1000 + "초 동안 입력하지 않았습니다.");
		
	}
}

class ScanReader extends Thread {

	TimeCheck tc;
	Scanner scan = new Scanner(System.in);
	int i;
	public static Boolean bl;

	public ScanReader() {

		TimeCheck tc = new TimeCheck(this, 3000);
		this.tc = tc;
		bl = true;

	}

	@Override
	public void run() {

		tc.start();
		while(bl){
//			i = scan.nextInt();
			System.out.println(i + "을 입력하셨습니다.");
			tc.interrupt();
		}
		System.out.println("bb");
	}
}

public class PracThread {

	public static void main(String[] args) {

		ScanReader sr1 = new ScanReader();
		sr1.start();

	}

}
