/*

�޼ҵ� �����ε�
����� ���� �޼ҵ带 ������ ���� �� ���

�޼ҵ� �����ε� ��Ģ
 - �޼ҵ���� ���� ������ Ÿ���� �ٸ��� ���
 - Ÿ���� ������ ������ ������ �ٸ��� ���
 - Ÿ�԰� ������ ������ ������ �ٸ��� ���
 
�����ε��� ����
 - ���뼺�� �����ֱ� ���ؼ�
 - ���� �������� ����� ������ �����ϴ� �޼ҵ���� ��Ƽ� �̸��� ���� �ؼ� ����ϱ� ���ؼ�
 - ���α׷��Ӱ� �پ��� �޼ҵ���� ȣ���� �� ���� �̸����� ȣ���� �� �ְ� ���ݴϴ�.
  	(�ϰ��� �۾��� �� �� �ֵ��� ���Ǹ� ����)
 

*/
public class OverloadingEx03 {

	public void getLength(String str){
		System.out.println("�Է��� �� \""+str+"\" �� ����: " + str.length());
	}
	
	public void getLength(int n){
		String s = String.valueOf(n);
		getLength(s);
	}
	
	public void getLength(float f){
		String s = String.valueOf(f);
		getLength(s);
	}
	
	public void getLength(float f, int a){
		String s = String.valueOf(f) + String.valueOf(a);
		getLength(s);
	}
	
	public void getLength(int a, float f){
		String s = String.valueOf(a) + String.valueOf(f);
		getLength(s);
	}
	
	public void getLength(String str, float f){
		String s = str + String.valueOf(f);
		getLength(s);
	}
	
	public void getLength(float f, String str){
		String s = String.valueOf(f) + str;
		getLength(s);
	}
	
	public void getLength(int n, float f, String str){
		String s = String.valueOf(n) + String.valueOf(f) + str;
		getLength(s);
	}
	
	
	public static void main(String[] args) {
		
		OverloadingEx03 oe = new OverloadingEx03();
		
		oe.getLength(1000);
		oe.getLength(10.2541f);
		oe.getLength("���ѹα�");
		oe.getLength(1000, 10.2541f);
		oe.getLength(10.2541f, 5000);
		oe.getLength("���ѹα�", 10.2541f);
		oe.getLength(10.2541f, "���ѹα�");

	}

}
