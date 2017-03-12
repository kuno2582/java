/*

다중 catch문
하나의 try문 내에 여러개의 예외가 발생할 때 사용합니다.

try{
	//예외 발생 가능한 문장
}catch(예상예외 객체1 변수명){

}catch(예상예외 객체2 변수명){

}catch(예상예외 객체3 변수명){

}


*/
public class ExceptionEx04 {

	public static void main(String[] args) {
		
		int var = 10;
		
		try{
			
			int data = Integer.parseInt(args[0]);
			System.out.println(var/data);
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("입력한 데이터가 없습니다.");
		}catch(NumberFormatException e){
			System.out.println("숫자가 아닙니다.");
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(Exception e){	//모든 예외 처리, 항상 마지막에 위치시키기
			System.out.println("나머지 예외 발생");
		}
		
		System.out.println("프로그램 끝");

	}

}
