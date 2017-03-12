
public class ArrayEx12 {

	public static void main(String[] args) {
		
		int [][] score ={
			{99, 89, 79},
			{98, 88, 78},
			{77, 98, 100},
			{87, 85, 97},
			{99, 89, 100}
		};
		
		int sum=0;
		double avr = 0;
		
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		
		for(int i=0; i<score.length; i++){
			System.out.print((i+1)+"\t");
			for(int j=0; j<score[i].length; j++){
				sum += score[i][j];
				System.out.print(score[i][j]+"\t");
			}
			avr = sum/score[i].length;
			System.out.print(sum+"\t");
			System.out.println(avr+"\t");
			sum = 0;
		}
		
	}

}
