/*

++a		�� ����, �� ����(���� �����ϰ� �� ���� ����)
--a		�� ����, �� ����(���� �����ϰ� �� ���� ����)

a++		�� ����, �� ����(���� �����ϰ� �� ���� ����)
a--		�� ����, �� ����(���� �����ϰ� �� ���� ����)
����/���� ���� �ش� ���� ���๮�� ������ �Ǵ� ���� �ƴ϶�
���� ���� ���� ����ǰ� �˴ϴ�. (����)


*/

public class OperatorEx08 {
	
	public static void main(String[] args){
		
		int n1 = 7;
		int result1=0;
		//++a		�� ����, �� ����(���� �����ϰ� �� ���� ����)
		result1 = ++n1;
		System.out.println("++n : " + result1);
		
		
		int n2 = 7;
		int result2=0;
		//--a		�� ����, �� ����(���� �����ϰ� �� ���� ����)
		result2 = --n2;
		System.out.println("--n: " + result2);
		
		int n3 = 7;
		int result3=0;
		//a++		�� ����, �� ����(���� �����ϰ� �� ���� ����)
		result3 = n3++;
		System.out.println("n3++ : " + result3);
		System.out.println("n3 : " + n3);
		
		
		int n4 = 7;
		int result4 = 0;
		//a--		�� ����, �� ����(���� �����ϰ� �� ���� ����)
		result4 = n4--;
		System.out.println("n4-- : " + result4 );
		System.out.println("n4 : " + n4);
	}

}
