/*

do~while문
- while문		선 비교, 후 처리
- do~while문		선 처리, 후 비교
- 조건식 만족하든 불만족하든 무조건 한번은 수행하는 제어문
- 조건식 뒤의 ;(세미콜론)으로 마무리

do{

}while(조건식);


*/
public class DoWhileEx01 {

	public static void main(String[] args) {
		
		int num=10;
		
		do{
			System.out.println("I like Friday" + num );
			num++;
		}while(num<7);
		
		
		
	}

}
