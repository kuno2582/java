/*
반복문
 - 원하는 특정 문장을 정해진 규칙에 따라 반복처리하기 위한 제어문
 - 모든 반복문은 무한루프에 빠지지 않도록 주의
 - for문, while문, do~while문
 
for문
for( 초기식; 조건식; 증감식 ){
	수행구문1;
	수행구문2;
}

*/
public class ForEx01 {

	public static void main(String[] args) {
		
		for(int i=1 ; i <= 5; i++){
			System.out.print("\t"+i);
		}
		System.out.println();
		System.out.println("\n");
		System.out.println("프로그램을 종료합니다.");
		

	}

}
