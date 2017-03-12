import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
throws
 - 현재 메소드에서 예외처리를 하기가 조금 어려운 상태일 때 현재 영역에서 에러처리를
 	하는 것이아니라 호출한 곳에서 예외처리를 할 수 있도록 예외객체를 대신 처리해 달라고 양도하는 것을 의미
 - throws 사용해서 발생한 예외객체의 양도를 합니다.
 - 양도를 받은 곳에서 다시 양도가 가능합니다.언젠가는 반드시 try catch문으로 예외처리를 해야
 	프로그램을 계속 유지할 수 있습니다.


*/
public class ExceptionEx05 {
	
	private void printData() throws IOException, NumberFormatException {	//readLine에 대한 예외 처리
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));//바이트 단위로 읽어서 문자로 변환
		
		System.out.println("단 입력 > ");
		int dan = Integer.parseInt(br.readLine());	//예외 발생가능을 메소드명 뒤에 명시
		System.out.println("입력된 단: " + dan);
		
		for(int i=1; i<=9; i++){
			System.out.println(dan + "*" + i + "=" + dan*i);
		}
		
	}

	public static void main(String[] args) {
		
		ExceptionEx05 ex = new ExceptionEx05();
		
		try{
			
			ex.printData();
			
		}catch(Exception e){
			System.out.println("오류가 발생했습니다.");
		}
		

	}

}
