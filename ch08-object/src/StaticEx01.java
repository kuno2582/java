/*

static
 - ����޼ҵ�� ��������� �����Ҷ� ���
 - ���������� Ŭ�������� ������ �� �����ϴ�.
 - ����޼ҵ�� ��������� static���� ���Ǹ� �ϸ�
 	static�޼ҵ�(Ŭ�����޼ҵ�), static����(Ŭ��������)
 - ���������� ������ �˴ϴ�. �׷��� ��� ��ü���� ����� �� �ְ� �˴ϴ�.
 
���������� static �ڷ��� ������; static age (MyClass)
���������� static ��ȯ�� �޼ҵ��(�ڷ��� ����1, ...){}
 
static ������ ���ٹ��
 - �ΰ��� ������� ������ ����
 - static������ ���� ����
 
�ν��Ͻ� �̸��� �̿��� ���ٹ��
	MyClass mc = new MyClass();
	mc.age;
	
Ŭ���� �̸��� �̿��� ���� ���(����)
	MyClass.age;

*/
public class StaticEx01 {

	public static void main(String[] args) {
		
		StaticCount sc1 = new StaticCount();
		System.out.println("c: " + sc1.c + ", count: " + StaticCount.count);
//		System.out.println("sc1.count: " + sc1.count);
		
		StaticCount sc2 = new StaticCount();
		System.out.println("c: " + sc2.c + ", count: " + StaticCount.count);
//		System.out.println("sc2.count: " + sc2.count);
//		System.out.println("sc1.count: " + sc1.count);
		
	}

}
