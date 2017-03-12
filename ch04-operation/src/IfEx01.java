/*

조건문, 비교문, 분기문
 - 주어진 조건의 결과에 따라 실행문장을 다르게 하여 전혀 다른 결과를 얻기 위해 사용하는 제어문
 - if문, switch문
 
if문
 - 한번에 하나의 조건을 판단 -> 분기
 - boolean형의 결과(true/false)

*/
public class IfEx01 {

	public static void main(String[] args) {
		
		int n = 4;
		
		if(n>5){
			System.out.println("n은 5보다 크다.");
		}
		
		System.out.println("프로그램 종료");

	}

}
