
public class DoWhileEx02 {

	public static void main(String[] args) {

		int su = 0;
		int nu1, nu2;
		nu1 = nu2 = 1;
		
		String msg = "Java World";
		
		System.out.println("do~while ������");
		do{
			System.out.println(nu1 +" : "+msg); //1 2 3 4 5 6
			nu1++;								//2 3 4 5 6 7
		}while(su++<5); //1 2 3 4 5 6
		System.out.println("do~while���� �� nu1: " + nu1);//7
		System.out.println("do~while���� �� su: " + su);//6
		
		
		System.out.println();
		System.out.println("while ������");
		su = 0;
		
		while(su++<5){
			System.out.println(nu2 +" : "+msg); 
			nu2++;
			
		}
		System.out.println("while���� �� nu2: " + nu2); //6
		System.out.println("while���� �� su: " + su); //6
		
	}

}
