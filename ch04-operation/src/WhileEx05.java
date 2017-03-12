
public class WhileEx05 {

	public static void main(String[] args) {

		java.util.Scanner input = 
				new java.util.Scanner(System.in);
		
		int num = 0;
		int total = 0;
		
		System.out.println("0입력 전까지 정수로 합계구합니다.");
		System.out.print("누적할 정수를 입력하세요 > ");
		
		while((num=input.nextInt()) !=0 ){
			total += num;
			System.out.println("누적합계 =" + total);
			
			System.out.println("누적할 데이터 입력 > ");
			
		}
		System.out.println("프로그램 종료");
		
		input.close();
	}

}
