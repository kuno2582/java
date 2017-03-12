
public class CastEx02 {

	public static void main(String[] args) {
		
		short num1 = 10;
		short num2 = 20;
		
		short result = (short)(num1 + num2);
		//short가 int형으로 바뀌어 연산이 일어나고 다시 short형으로 변환이 일어난다.
		System.out.println(result);
		
		short result2 = (short)(num1 + num2);
		System.out.println(result2);

	}

}
