/*
다차원 배열
- 1차원 배열이 여러 개 모인 배열을 의미
- 99% 2차원 배열


2차원 배열
- 2차원의 구조를 가지는 배열
- 가로와 세로의 길이를 가진 배열의 인스턴스를 생성합니다.

데이터형식[][] 배열명 = new 데이터형식[가로][세로] 

*/

public class ArrayEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int test[][];
//		
//		test = new int[2][3];
//		
//		test[0][0]=100;
//		test[0][1]=200;
//		test[0][2]=300;
//				
//		test[1][0]=400;
//		test[1][1]=500;
//		test[1][2]=600;
		
		int [][] test = {
				{100, 200, 300},
				{400, 500, 600}
		};
		
		for(int i=0; i<test.length; i++){
			for(int j=0; j<test[i].length; j++){
				
				System.out.println(test[i][j]);
				
			}
		}

	}

}
