
/*

short vs int
- CPU가 int형 데이터의 크기만 연산 가능
- 그렇기 때문에 short형 선언한 데이터가 있다면 
연산 직전에 int형 데이터로 변환된 후 연산을 수행하게 됩니다.
- 프로그램 수행 중 불필요한 변환과정을 생략할 수 있도록 int형을 사용하는 것이 좋습니다.

short와 byte
 - 연산보다 데이터 저장이 중요시 될 때 사용하게 됩니다.
 - 데이터 성격이 강하다면 short와 byte형으로 저장하는 것이 좋습니다.
 - mp3파일, 동영상파일, 게임캐릭터 정보 저장하는 등 활동
 


*/

public class VariableEx02 {
	public static void main(String[] args){
		
		int num1 = 2016;
		int num2 = -2016;
		
		System.out.println(num1);
		System.out.println(num2);
		
	}
}
