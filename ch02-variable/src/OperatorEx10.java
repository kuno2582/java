
public class OperatorEx10 {

	public static void main(String[] args) {

		System.out.println("논리 곱:");
		int a,b;
		a = b = 10;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		boolean c = (a++ >= ++b) && (++a > b++);
					//10 >= 11   &&  11 > 10
					//false		 &&  true
		
		System.out.println("c: " + c);
		System.out.println("a: " + a); //11
		System.out.println("b: " + b); //11
		
		//논리 합
		int d, e;
		d = e = 10;
		
		boolean f = (++d > e++) || (d++ >= ++e);
		
		System.out.println("f: " + f);
		System.out.println("d: " + d); //11
		System.out.println("e: " + e); //11

	}

}
