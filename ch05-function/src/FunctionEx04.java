
public class FunctionEx04 {

	public static void main(String[] args) {
		
		dividededby(10,2);
		dividededby(19,3);
		dividededby(10,0);
		
		int returnResult = divide(86,3);
		System.out.println("���ϵ� ���: " + returnResult);

	}
	
	public static void dividededby(int num1, int num2){
		
		if(num2 == 0){
			System.out.println("(�˸�) 0������ ���� �� �����ϴ�.");
			return;
		}
		
		System.out.println("������ ���: " + (num1/num2));
	}

	public static int divide(int num1, int num2){
		int result = 0;
		
		if(num2 == 0){
			System.out.println("(�˸�) 0������ ���� �� �����ϴ�.");
		}else{
			result = num1/num2;
		}
		
		return result;
	}
}