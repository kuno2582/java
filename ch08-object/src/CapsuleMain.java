/*

��������(Information Hiding)
 - ������ ���� �����ϴ� ���� ������� �ʴ� ��
 - Ŭ���� �ȿ� �ִ� ������ ������ �ʵ��� ���δ� ��
 - ��ü���� ��ӵ��� ���� �κ��� ����� �˴ϴ�.
 
  
���м�(Encapsulation)
 - �ּ����� ��ɸ��� �����ϰ� ���δ� ��� ���ߴ� ��
 - ��Ӱ� �������� �Բ� OOP(��ü�������α׷���)�� 3�� Ư¡
 
private �������;

public �޼ҵ�;

*/

class Capsule {
	
	private int a;
	
	public void setA(int n){
		
		if(n >= 0)
			a = n;
		else
			System.out.println("������ ������ �ʽ��ϴ�.");
	}
	
	public int getA(){
		return a;
	}
}

public class CapsuleMain {
	
	private int a;
	
	public void setA(int n){
		a = n;
	}
	
	public int getA(){
		return a;
	}
	
	public static void main(String[] args){
		
		CapsuleMain csm = new CapsuleMain();
		csm.a = 10;
		System.out.println(csm.a);
		csm.a = -10;
		System.out.println(csm.a);
		
		Capsule cs = new Capsule();
		cs.setA(12);
		System.out.println(cs.getA());
		cs.setA(-12);
		System.out.println(cs.getA());
		
	}

}
