/*
���ȣ��
 - �ڷᱸ�� �˰����� �����ϱ� ���ؼ� �ʿ��� �κ�
 - ��������� �޼ҵ� ȣ���ϴ� ��
 - �Լ��� ���纻�� �ϳ� �� �����ؼ� �����ϴ� ���� ����Դϴ�.
 - ���������� �������� ������ ���ѷ����� ���� �� �ֽ��ϴ�. (����)
 - �������� �޼ҵ� ����κа� ��͸޼ҵ尡 ����Ǵ� �κп� ���������� ��ġ���Ѿ� �մϴ�.

��͸޼ҵ�(Recursive Method)




*/
public class RecuresiveEx01 {

	public static void main(String[] args) {
		System.out.println("5! = "+factorial(5));
	}
	
	public static int factorial(int n){
		
		if(n==1)
			return 1;
		else
			return n*factorial(n-1);
	}

}
