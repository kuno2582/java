/*

this()
 - ���� ��ü�� ������
 - �������� ù �࿡ �����ؾ� �մϴ�. 

*/
public class ThisEx03 {
	
	public ThisEx03(){
		
		this("���ھ��� ������");
		
		System.out.println("������ ȣ���� ���๮ ȣ��");
		
	}
	
	public ThisEx03(String msg){	//���Ʒ� ������ ��� �� �����ڸ� ��ħ
		System.out.println(msg);
	}
	
	public ThisEx03(int a){
		this(String.valueOf(a));
	}

	public static void main(String[] args) {
		
		ThisEx03 t = new ThisEx03();
		System.out.println(t);
		
		ThisEx03 t2 = new ThisEx03(1000);
		System.out.println(t2);
		
		ThisEx03 t3 = new ThisEx03("hahaha");
		System.out.println(t3);
		
	}

}
