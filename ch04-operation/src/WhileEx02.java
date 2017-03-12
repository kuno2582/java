
public class WhileEx02 {

	public static void main(String[] args) {

		int i = 10;
		
		while(i>=0){
			System.out.println(i--);
		}
		System.out.println("i: " + i);
		
		System.out.println();
		int j = 10;
		while(j>=0){
			System.out.println(--j);
		}
		System.out.println("j: " + j);
	}

}
