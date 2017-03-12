/*
예외(Exception)
 - 예상하는 일 외에 뜻하지 않은 일들이 생길 수 있습니다.
 - 예외를 대비하고 준비하는 것을 "예외처리"라고 합니다.
 
예외처리
 - 호출하고자 하는 메소드가 예외를 발생시킬 수 있다면 2가지 방법은 하나로
 2가지 방법중 하나로 조치를 반드시 해주어야 합니다.
 
 1)try~catch
 2.throws를 이용해서 예외 전달

*/
public class ExceptionEx02 {

	public static void main(String[] args) {
		
		int[] var = {10, 20, 30};
		
		for(int i=0; i<=3; i++){
			
			try{	//예외가 발생할 가능성이 있는 코드
				System.out.println("var["+i+"] : " + var[i]);
			}catch(ArrayIndexOutOfBoundsException e){	//예외 발생시 대체할 코드 뭔지
				//e.printStackTrace();
				
				//System.out.println(e.toString());
				
				System.out.println("없는 인덱스 호출");
			}
		}

	}

}
