/*

������(Constructor)
 - ��ü�� ������ �� �ڵ������� �� �ѹ� ȣ��
 - ��ü�� ������ ������ִ� ����
 - �����Ǵ� ��ü�� ����������� �ʱ�ȭ�ϴ� ����
 
 
������ ����
 - �������� �̸��� Ŭ������� ���ƾ� �մϴ�.
 - return Ÿ���� ���ǵ��� �ʽ��ϴ�. ��ȯ���� �ʴ� �޼ҵ�
 - ��ü ������ �����ڴ� �ݵ�� ȣ��Ǿ����ϴ�. 
 - final����� �ʱ�ȭ ���
 
class Ŭ������{

	[����������] Ŭ������(�ڷ��� ����1, �ڷ��� ����2){
		���๮1;
		���๮2;
	}
	
}



public class ObjectEx02 {

	public static void main(String[] args) {
		
		Number myNumber1 = new Number();
		Number myNumber2 = new Number();
		
		System.out.println("myNumber1�� �޼ҵ� ȣ�� �� ��: " + myNumber1.getNum());
		System.out.println("myNumber2�� �޼ҵ� ȣ�� �� ��: " + myNumber2.getNum());
		
		instMethod(myNumber1);
		instMethod(myNumber2);
		
		System.out.println("myNumber1�� �޼ҵ� ȣ�� �� ��: " + myNumber1.getNum());
		System.out.println("myNumber2�� �޼ҵ� ȣ�� �� ��: " + myNumber2.getNum());

	}
	public static void instMethod(Number number){
		number.addNum(10);
	}
}

class Number{
	int num;
	
	public Number(){
		num = 30;
		System.out.println("������ ȣ��");
	}
	
	public void addNum(int n){
		num += n;
	}
	
	public int getNum(){
		return num;
	}
}



*/