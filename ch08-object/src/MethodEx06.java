/*

가변인자(Varargs; Variable ARGuments)
 - 타입은 일치하지만 인자의 개수가 가변적 호출
 - 메소드 정의시 "..."라고 명시하면 됩니다.
 - 메소드 호출시 필요한 인자의 수를 유연하게 구현할 수 있습니다.
 
 
 지정자 리턴타입 메소드명(데이터타입... 변수명) {}	//인자를 배열로 받는다.

*/
public class MethodEx06 {
	
	public void getNum(int num){
		System.out.println("전달된 숫자: " + num);
	}
	
	public void argsTest(int ... n){
		for(int i=0; i<n.length; i++){
			System.out.println("n["+i+"]:"+n[i]);
		}
		System.out.println("----------");
	}

	public static void main(String[] args) {
		
		MethodEx06 m = new MethodEx06();
		m.getNum(50);
		m.argsTest(50, 60, 70);
		m.argsTest(22,33);
		m.argsTest(50, 60, 70, 100, 500, 9900, 800, 545);

	}

}
