/*

continue��
- �ݺ����� ���������� ���� ����ϴ� ���� �ƴ϶�
- continue�� ������ ������ �������� �ʰ� ���� ȸ���� �ݺ��� �����ϱ� ����
  ����Դϴ�. 

*/
public class ContinueEx01 {

	public static void main(String[] args) {
		
		//1~10����� �� 3�� ����� ������� �ʰ� ����Ͻñ� �ٶ��ϴ�.
		for(int i=0 ; i<=10 ; i++ ){
			
			if(i%3==0) //3�� ���
				continue;
			
			System.out.println(i);
		}

	}

}
