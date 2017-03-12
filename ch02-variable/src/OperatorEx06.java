
public class OperatorEx06 {
	//매개변수 = 함수의 인자
	public static void main(String[] abcdefg){
		
		int a = 10;
		float b = 10.0F;
		
		if(a==b){
			//int == float
			//a: int -> float (10 -> 10.0F)
			//10.0F == 10.0F
			System.out.println("a와b는 같다.");
			System.out.println("a : " + a);
			System.out.println("b : " + b);
		} 
		
		char c = '0';
		int d = 0;
		//c: char -> int ('0' -> 48)
		//48 != 0
		if(c!=d){
			System.out.println("c와 d는 같지 않다.");
			System.out.println("c : " + c);
			System.out.println("d : " + d);
		}
		
		char e = 'A';
		int f = 65;
		if(e==f){
			//e: char -> int ('A' -> 65)
			//65 == 65
			System.out.println("e와 f는 같다.");
			System.out.println("e : " + e);
			System.out.println("f : " + f);
		}
	}
}
