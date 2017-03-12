
public class ArrayEx07 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		float average = 0.0F;
		
		int[] score = {100, 88, 89, 100, 90};
		
		for(int i=0; i<score.length; i++){
			sum += score[i];
		}

		average = sum/score.length;
		
		System.out.println("ÃÑÇÕ: " + sum);
		System.out.println("Æò±Õ: " + average);
	}

}
