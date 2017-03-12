/*

��ü(Object)
 - �ν��Ͻ�(instance)
 - �ν��Ͻ��� Ŭ����(û����)�� ���ؼ� ������� ��
 - ��ü�� �ڽŸ��� ������ ������ �ִ� �������� ����
 
��ü ����
��ü = ����(����, �Ӽ�, ������) + �޼ҵ�(����, ���, ����, ���, ���)

Ŭ���� ����
 - classŰ���带 ����ؼ� �����մϴ�.
 
[������] class Ŭ������{		//Ŭ���� ���
	���� ����
	�޼ҵ� ����
	
	������ ����
}

Ŭ���� ���
 - Ŭ���� ���� �κ�
 - Ŭ���� Ű������ Ŭ������
 - class Ű������ ���ʿ��� ��������(������), Ŭ��������, Ŭ��������
 
[��������] [Ŭ��������] class [Ŭ������]


��ü ����
 - Ŭ������ �̸��� ������ �̸��� ���� ������(�Լ�)�� �̿��ؼ� ��ü�� �����ϰ� �˴ϴ�.
 - �̶� new Ű����� �Բ� �������Լ��� ȣ���ϸ� ��ü�� �����˴ϴ�.
 
 Ŭ���� ��ü�� = new ������();
 
 
 
 ��� ���ٹ��
 mc���� ������ ��ü�� �������� ����Ǿ��� �ֽ��ϴ�.
 mc ���۷����� ���ؼ� .(��)�� ����ؼ� �ش� ��ü�� �޼ҵ峪 ������ ������ �� �ֽ��ϴ�.
 
 MyClass mc = new MyClass();
 mc.setName();
 
 System.out.println();

*/
public class InstanceEx01 {
	//Ŭ������ �������: ����ʵ�(����,���), ����޼ҵ�, ������
	
	//����ʵ�
	int var1;
	final int NUM_TWO=2;
	
	//�������Լ�
	//��ü ������ ȣ���̵Ǵ� �Լ� , ��ü�� ������Ű�� ��������� �ʱ�ȭ�ϴ� ����
	public InstanceEx01(){
		
	}
	
	//����޼ҵ�
	public int sum(int a, int b){
		return a+b;
	}
	
	public static void main(String[] args) {
		
		//��ü ����
		InstanceEx01 me1;
		InstanceEx01 me2;
		
		
		//��ü ����
		me1 = new InstanceEx01();
		me2 = new InstanceEx01();
		
		System.out.println(me1);
		System.out.println(me2);
		
		System.out.println(me1.var1);	//�⺻������ �ڵ� �ʱ�ȭ�Ǿ�����
		System.out.println(me1.NUM_TWO);
		
		me1.var1 = 10;
		
		System.out.println(me1.var1);
		System.out.println(me2.var1);
		
//		me1.NUM_TWO = 20;
		
		int result = me1.sum(20, 40);
		System.out.println(result);

	}

}
