/*

메소드 오버로딩(Overloading)
 - 하나의 클래스 안에서 같은 이름을 가지는 메소드는 여러 개 정의하는 것
 - 컴파일시 컴파일러가 각각의 정의된 메소드들을 구별해주는데,
 	구별의 기준은 함수의 인자가 됩니다.
 	

접근제한자 반환형 메소드명(자료형 인자1, 자료형 인자2, ...) { };

메소드명(반드시 다르게 지정)
메소드명(자료형)
메소드명(인자개수)

*/
public class OverloadingEx02 {

	//객체 생성시 메인메소드는 객체에 포함되지 않습니다.
	public static void main(String[] args) {
		
		OverloadingEx02 oe = new OverloadingEx02();
		oe.getLength(1000);
		oe.getLength(3.141592f);
		oe.getLength("Horizen");
		
	}
	
	public void getLength(String str){
		System.out.println("입력한 값의 길이: " + str.length());
	}
	
	public void getLength(int n){
		String s = String.valueOf(n);
		getLength(s);
	}
	
	public void getLength(float n){
		String s = String.valueOf(n);
		getLength(s);
	}

}
