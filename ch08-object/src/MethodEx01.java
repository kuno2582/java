/*

ĸ��ȭ(Encapsulation)
 - ������ ���� ����� ����� ����ڿ��Դ� ��� ����� �˷��ִ� ��
 - ������ �ִ� ������ �Ǵ� ����(���)���� �ϳ��� �����ִ� ����
 - ����ڿ��Դ� �������� ������ ������� �ʴ� ��ſ� ����� ���Ǽ��� �������ִ� ������ �մϴ�.
 - 

*/
public class MethodEx01 {
	
	int var1, var2;
	
	public int sum(int a, int b){
		return a + b;
	}
	
	public int times(int a, int b){
		return a * b;
	}

	public static void main(String[] args) {
		
		MethodEx01 mm = new MethodEx01();
		
		System.out.println(mm.sum(80, 20));
		
		System.out.println(mm.times(80, 20));

	}

}
