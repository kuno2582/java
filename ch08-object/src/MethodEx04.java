/*

인자 전달 방식
Call by Balue (값 호출)
 - 값을 복사해서 전달
 - 호출시의 그 값은 별도의 값으로 인식되어서 영향을 받지 않습니다.
 
Call by Reference(참조 호출)
 - 참조값 복사해서 전달
 - 하나의 객체를 참조하는 변수가 2개가 됩니다. 어느 한곳에서 수정을 하게되면
 	같은 객체를 참조하는 다른 쪽에서도 영향을 받게됩니다.


*/
public class MethodEx04 {

	public int increase(int v){
		++v;
		return v;
	}
	
	
	public static void main(String[] args) {
		
		int var1 = 100;
		MethodEx04 m = new MethodEx04();
		m.increase(var1);
		
		System.out.println("var1 : "+ var1);
		
		int var2 = m.increase(var1);
		System.out.println("var2 : "+ var2);
		
	}

}
