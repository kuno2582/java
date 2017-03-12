/*
대입연산자
=	
연산자를 기준으로 오른쪽에 있는 값을 왼쪽에 있는 변수에 저장(대입, 할당)

대입연산자 & 산술연산자 -> 복합대입연산자

a=a+b	a+=b
a=a-b	a-=b
a=a*b	a*=b
a=a/b	a/=b
a=a%b	a%=b


*/
public class OperatorEx04 {
	
	public static void main(String[] args){
		
		
		int a = 100;
		int b = 3;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		a +=b; // a= a+b
		System.out.println("a+=b: " + a);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		a -=b;
		System.out.println("a-=b: " + a);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		a *=b;
		System.out.println("a*=b: " + a);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		a /=b;
		System.out.println("a/=b: " + a);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		a %=b;
		System.out.println("a%=b: " + a);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		
	}

}
