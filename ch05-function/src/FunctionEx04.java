
public class FunctionEx04 {

	public static void main(String[] args) {
		
		dividededby(10,2);
		dividededby(19,3);
		dividededby(10,0);
		
		int returnResult = divide(86,3);
		System.out.println("리턴된 결과: " + returnResult);

	}
	
	public static void dividededby(int num1, int num2){
		
		if(num2 == 0){
			System.out.println("(알림) 0값으로 나눌 수 없습니다.");
			return;
		}
		
		System.out.println("나눗셈 결과: " + (num1/num2));
	}

	public static int divide(int num1, int num2){
		int result = 0;
		
		if(num2 == 0){
			System.out.println("(알림) 0값으로 나눌 수 없습니다.");
		}else{
			result = num1/num2;
		}
		
		return result;
	}
}