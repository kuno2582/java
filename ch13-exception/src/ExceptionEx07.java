
public class ExceptionEx07 {

	public static void main(String[] args) {
		
		try {
			int num = Integer.parseInt(args[0]);
			
			System.out.println("인자값: " + num);
		} catch (Exception e) {
			System.out.println("매개변수가 잘못 입력되었습니다.");
		}finally {
			System.out.println("프로그램을 종료합니다.");
		}
		
		
	}

}
