
public class ArrayEx08 {

	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		String[] subname = {"국어", "영어", "수학", "과학"};
		
		int[] score = new int[subname.length+1];
		float average = 0.0F;
		
		for(int i=0; i<subname.length; i++){
			
			do{
				System.out.println(subname[i]+" 점수를 입력하세요 > ");
				score[i] = input.nextInt();
			}while(score[i]<0 || score[i]>100);
			
			//총점 누적
			score[score.length-1] += score[i];
		}
		
		average = score[score.length-1]/score.length-1;
		
		System.out.println("-----------------------");
		
		for(int i=0; i<subname.length; i++){
			System.out.println(subname[i]+" : "+score[i]);
		}
		System.out.println("총점 : "+score[score.length-1]);
		System.out.println("평균 : "+average);

		input.close();
	}

}
