/*
���Կ�����
=	
�����ڸ� �������� �����ʿ� �ִ� ���� ���ʿ� �ִ� ������ ����(����, �Ҵ�)

���Կ����� & ��������� -> ���մ��Կ�����

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
