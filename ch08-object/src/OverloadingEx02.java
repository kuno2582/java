/*

�޼ҵ� �����ε�(Overloading)
 - �ϳ��� Ŭ���� �ȿ��� ���� �̸��� ������ �޼ҵ�� ���� �� �����ϴ� ��
 - �����Ͻ� �����Ϸ��� ������ ���ǵ� �޼ҵ���� �������ִµ�,
 	������ ������ �Լ��� ���ڰ� �˴ϴ�.
 	

���������� ��ȯ�� �޼ҵ��(�ڷ��� ����1, �ڷ��� ����2, ...) { };

�޼ҵ��(�ݵ�� �ٸ��� ����)
�޼ҵ��(�ڷ���)
�޼ҵ��(���ڰ���)

*/
public class OverloadingEx02 {

	//��ü ������ ���θ޼ҵ�� ��ü�� ���Ե��� �ʽ��ϴ�.
	public static void main(String[] args) {
		
		OverloadingEx02 oe = new OverloadingEx02();
		oe.getLength(1000);
		oe.getLength(3.141592f);
		oe.getLength("Horizen");
		
	}
	
	public void getLength(String str){
		System.out.println("�Է��� ���� ����: " + str.length());
	}
	
	public void getLength(int n){
		String s = String.valueOf(n);
		getLength(s);
	}
	
	public void getLength(float n){
		String s = String.valueOf(n);
		getLength(s);
	}

}
