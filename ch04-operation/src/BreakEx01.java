/*
break;
가장 가까운 반복문을 빠져나갈대 사용하는 제어문

*/

public class BreakEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<=100 ; i++){
			
			System.out.println(i);
			
			if(i==8){
				break;
			}
			
		}
		System.out.println("프로그램 종료!!");

	}

}
