
// 1~100까지 누적합

public class WhileEx03 {

	public static void main(String[] args) {
		
		int i=0;
		int sum=0;
		
		while(i<=100){
			sum += i;
			i++;
		}
		
		System.out.println("1~100까지 합계는 :" + sum);

	}

}
