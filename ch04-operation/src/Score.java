import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int 국어 = 0, 영어 = 0, 수학 = 0, 총점 = 0;
		
		float 평균;
		
		do{
		System.out.println("국어 > ");
		국어 = scan.nextInt();
		}while(국어 < 0 || 국어 > 100);
		
		do{
		System.out.println("영어 > ");
		영어 = scan.nextInt();
		}while(영어 < 0 || 영어 > 100);
		
		do{
		System.out.println("수학 > ");
		수학 = scan.nextInt();
		}while(수학 <0 || 수학 > 100);
		
		총점 = 국어 + 영어 + 수학;
		평균 = 총점/3;
		
		System.out.println("총점: "+총점);
		System.out.println("평균: "+평균);
		

		
		
		
		scan.close();
	}

}
