
public class ExceptionEx03 {

	public static void main(String[] args) {
		
		int[] var = {10, 20, 30};

		try{
			//System.out.println("Important Message!");
			System.out.println("var[4]" + var[4]);
			System.out.println("Important Message!");	//예외발생 이후 코드는 실행되지 않는다
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ERROR-없는 인덱스를 호출했습니다.");
		}
		
		System.out.println("프로그램 종료!");
	}

}
