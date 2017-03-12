/*
���������� SCE(Short-Circuit Evaluation)
- �ִܰŸ� ����
- �������� ���°Ϳ� ���� �� �̻� ������ �������� �ʴ� ���� ����մϴ�.
- �ڹٴ� SCE ������ ����


������ && ������
�������� true�϶��� �������� �����մϴ�.
�������� false�� ��� �������� �������� �ʽ��ϴ�.
true  && true -> true
         false -> false
false && X

������ || ������
�������� true�̸� �������� �������� �ʽ��ϴ�.
�������� false�� ��쿡�� �������� �����մϴ�.
true  || X  -> true
false || true -> true
         false -> false


*/
public class OperatorEx11 {
	
	public static void main(String[] args){
		
		int num1=0, num2=0;
		boolean result;
		
		result = ( (num1+=10)<0 ) && ( (num2+=10)>0 ) ;
		//(num1+=10)<0 -> 0+=10<0 -> 10<0 -> false
		//(num2+=10)>0 -> 0+=10>0 -> 10>0 -> true (���� ���� ����)
		System.out.println("result: " + result);
		System.out.println("num1: " + num1 + ", num2: " + num2);
		
		
		result = ( (num1+=10)>0 ) || ( (num2+=10)>0 );
		//(num1+=10)>0 -> (10+=10)>0 -> 20>0 -> true
		//(num2+=10)>0 -> (0+=10)>0 -> 10>0 -> true (���� ���� ����)
		
		System.out.println("result: " + result);
		System.out.println("num1: " + num1 + ", num2: " + num2);
		
		
	}

}
