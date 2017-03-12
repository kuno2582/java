
public class BreakEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner input = 
				new java.util.Scanner(System.in);
		
		int a = 0;
		int total = 0;
		
		System.out.println("0전까지 입력받은 정수로 합 구하기");
		while(true){
			
			System.out.print("누적할 정수를 입력하세요 > ");
			a = input.nextInt();
			
			//특정 조건 -> 반복문 탈출(무한루프 탈출)
			if( a==0 )
				break;
			else
				total += a;
		}
		System.out.println("total: " + total);
		
		input.close();

	}

}
