/*

Scanner 클래스
 - 키보드로 입력한 정보를 입력받아서 사용할 수 있습니다.
 - 다양한 리소스(키보드 이외에도)를 입력 받을 수 있도록 정의된 클래스
 - java.util 패키지 안에 있는 클래스 (java.util.Scanner)

*/
public class InputEx01 {

	public static void main(String[] args) {
		
		String source = "1 3 5 7 9";
		
		//문자열을 입력대상으로하는 Scanner객체(인스턴스) 생성
		java.util.Scanner scanner = new java.util.Scanner(source);
		
		int num1 = scanner.nextInt(); //1
		int num2 = scanner.nextInt(); //3
		int num3 = scanner.nextInt(); //3
		int num4 = scanner.nextInt(); //3
		int num5 = scanner.nextInt(); //3
		
		int sum = num1 + num2 + num3 + num4 + num5;
		
		System.out.printf("문자열에 저장된 %d %d %d %d %d의 합은\n"+ "%d 입니다.",num1,
				num2,num3,num4,num5,sum);
		
		scanner.close();

	}

}
