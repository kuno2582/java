
public class CastEx02 {

	public static void main(String[] args) {
		
		short num1 = 10;
		short num2 = 20;
		
		short result = (short)(num1 + num2);
		//short�� int������ �ٲ�� ������ �Ͼ�� �ٽ� short������ ��ȯ�� �Ͼ��.
		System.out.println(result);
		
		short result2 = (short)(num1 + num2);
		System.out.println(result2);

	}

}
