

//1~100
//3의 배수이고 7의 배수인 수만 카운트
//5
//4

public class ContinueEx02 {

	public static void main(String[] args) {

		int num=0;
		int count=0;
		
		while( (num++)<=100 ){
			if(num%3!=0 || num%7!=0)
				continue;
			
			count++;
			System.out.println(num);
			
		}
		
		System.out.println("count: " + count);
		
	}

}
