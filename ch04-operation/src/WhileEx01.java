/*

while문
- for문 같은 조건식을 만족할 경우에만 반복하는 제어문
- 한번도 수행하지 않을 수 있습니다.

while(조건식){
	수행구문;
}

*/
public class WhileEx01 {

	public static void main(String[] args) {
		//초기식
		int num=0;
		
		while(num<5){ //조건식
			System.out.println("I Love JAVA - " + num);
			
			//증감식
			num++;
		}

	}

}
