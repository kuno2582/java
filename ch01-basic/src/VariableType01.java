/*
변수 자료형
 - 논리형
 - 문자형
 - 정수형
 - 실수형
*/
public class VariableType01 {
	public static void main(String[] args){
		
		boolean bool = true;
		//true, false 논리형 자료형
		//크기: 1byte
		System.out.println("bool: " + bool);
		
		//문자형 자료형
		//크기: 2byte
		char char_a1 = 'A';
		System.out.println("char_a1 : " + char_a1);
		
		char char_a2 = 65;
		System.out.println("char_a2 : " + char_a2);
		
		char char_c1 = '자';
		System.out.println("char_c1 : " + char_c1);
		
		char char_c2 = '\uc790';
		System.out.println("char_c2 : " + char_c2);
		
		//정수형
		//크기: 1byte
		//byte b1 = 128;
		byte b1 = 127;
		System.out.println(b1);
		
		//2byte (-32,768~32,767)
		//short s1 = 32768;
		short s1 = 32767;
		System.out.println("s1 : " + s1);
		
		//4byte (-2,147,483,648~2,147,483,647)
		int i1 = 12345678;
		System.out.println("i1 : " + i1);
		
		//8byte
		long lg1 = 123456;
		long lg2 = 123456l; //끝에 l을 붙이형 long형이라는 것을 알려줌
		long lg3 = 123456L;
		
		System.out.println("lg1: " + lg1);
		System.out.println("lg2: " + lg2);
		System.out.println("lg3: " + lg3);
		
		
		//실수형
		//4byte
		float f1 = 9.1F;
		System.out.println("f1: " + f1);
		
		//double 크기: 8byte
		double d1 = 9.8;
		double d2 = 9.8d;
		System.out.println("d1: " + d1);
		System.out.println("d2: " + d2);
		
	}
}
