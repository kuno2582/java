/*
메소드(method, 함수, function)
 - 객체지향에서 함수를 의미
 - 특정 작업을 하기 위한 일련의 코드들을 하나의 이름으로 묶어놓은 코드의 집함
 - 입력값을 받아서 그것을 처리한 후 하나의 결과값으 돌려주는 역할
 - 한번 정의해주면 몇번이든 호출해서 실행할 수 있다.(반복 작업 처리에 유용)

*/
public class FunctionEx01 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작!");
		tellTime(11);
		System.out.println("프로그램 종료!");

	}
	
	public static void tellTime(int hour){
		
		System.out.println("활기찬 월요일 아침입니다.");
		System.out.println("현재시각은 "+hour+"시 입니다.");
		
	}

}
