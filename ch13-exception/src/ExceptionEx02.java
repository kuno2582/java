/*
����(Exception)
 - �����ϴ� �� �ܿ� ������ ���� �ϵ��� ���� �� �ֽ��ϴ�.
 - ���ܸ� ����ϰ� �غ��ϴ� ���� "����ó��"��� �մϴ�.
 
����ó��
 - ȣ���ϰ��� �ϴ� �޼ҵ尡 ���ܸ� �߻���ų �� �ִٸ� 2���� ����� �ϳ���
 2���� ����� �ϳ��� ��ġ�� �ݵ�� ���־�� �մϴ�.
 
 1)try~catch
 2.throws�� �̿��ؼ� ���� ����

*/
public class ExceptionEx02 {

	public static void main(String[] args) {
		
		int[] var = {10, 20, 30};
		
		for(int i=0; i<=3; i++){
			
			try{	//���ܰ� �߻��� ���ɼ��� �ִ� �ڵ�
				System.out.println("var["+i+"] : " + var[i]);
			}catch(ArrayIndexOutOfBoundsException e){	//���� �߻��� ��ü�� �ڵ� ����
				//e.printStackTrace();
				
				//System.out.println(e.toString());
				
				System.out.println("���� �ε��� ȣ��");
			}
		}

	}

}
