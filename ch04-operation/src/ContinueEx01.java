/*

continue문
- 반복문을 빠져나가기 위해 사용하는 것이 아니라
- continue문 이하의 문장을 수행하지 않고 다음 회차의 반복을 수행하기 위한
  제어문입니다. 

*/
public class ContinueEx01 {

	public static void main(String[] args) {
		
		//1~10출력할 때 3의 배수는 출력하지 않고 출력하시기 바랍니다.
		for(int i=0 ; i<=10 ; i++ ){
			
			if(i%3==0) //3의 배수
				continue;
			
			System.out.println(i);
		}

	}

}
