

//1~100
//3�� ����̰� 7�� ����� ���� ī��Ʈ
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
