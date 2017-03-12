/*
증감 연산자
1씩 증가 연산자
1씩 감소 연산자
수치형 데이터
연산자가 변수의 앞에 위치하느냐, 뒤에 위치하느냐에 따라서 주의

++
--

*/

public class OperatorEx07 {
	
	public static void main(String[] args){
		
		int i1=5;
		int i2=5;
		System.out.println("증가연산자 선행: " + (++i1) );
		System.out.println("i1 : " + i1);
		
		System.out.println("증가연산자 후행: " + (i2++) );
		System.out.println("i2 : " + i2);
		
		int j1 = 10;
		int j2 = 10;
		
		System.out.println("감소연산자 선행: " + (--j1) );
		System.out.println("j1 : " + j1);
		
		System.out.println("감수연산자 후행: " + (j2--) );
		System.out.println("j2 : " + j2);
		
		
		
		
		
		
	}

}
