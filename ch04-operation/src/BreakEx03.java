/*
3�� ����̰� 7�� ����� ���� ã����
�� �̻� �������� �ʰ�  while���� ���������� ���α׷�

1~100
3�� ����̰� 7�� ����� ���� ã���� while���� ����������
while���� �������� ���� ã�� ���ڸ� ����ϰ�, 
ã�� ���� ���� ã�� ���ߴٰ� ����ϱ�

*/

public class BreakEx03 {

	public static void main(String[] args) {
		
		int i=1;
		
		while(i<=100){
			
			if(i%3==0 && i%7==0)
				break;
			i++;
		}
		
		System.out.println("ã�� ���ڴ�: " + i);

	}

}
