
/*

����Ʈ ������
 - �����ڸ� �������� �ʾ��� ��쿣 ȣ��Ǿ����� �������Դϴ�.

*/
public class ObjectEx03 {

	public static void main(String[] args) {
		
		Number myNumber1 = new Number(10);
		Number myNumber2 = new Number();
		
		System.out.println("myNumber1�� ��: " + myNumber1.getNum());
		System.out.println("myNumber2�� ��: " + myNumber2.getNum());
		instMethod(myNumber1);
		instMethod(myNumber2);
		System.out.println("myNumber1�� ��: " + myNumber1.getNum());
		System.out.println("myNumber2�� ��: " + myNumber2.getNum());

	}
	
	public static void instMethod(Number number){	//static�� �־�� ��ü�������� ���
		number.addNum(10);
	}

}

class Number {

	int num;
	
	public Number(){
		
	}
	
	public Number(int a){
		num = a;
		System.out.println("������ ȣ��");
		System.out.println("���޵� ���ڰ�: " + a);
	}
	
	public void addNum(int n){
		num += n;
	}
	
	public int getNum(){
		return num;
	}
	
}