/*

���� ���� ���
Call by Balue (�� ȣ��)
 - ���� �����ؼ� ����
 - ȣ����� �� ���� ������ ������ �νĵǾ ������ ���� �ʽ��ϴ�.
 
Call by Reference(���� ȣ��)
 - ������ �����ؼ� ����
 - �ϳ��� ��ü�� �����ϴ� ������ 2���� �˴ϴ�. ��� �Ѱ����� ������ �ϰԵǸ�
 	���� ��ü�� �����ϴ� �ٸ� �ʿ����� ������ �ްԵ˴ϴ�.


*/
public class MethodEx04 {

	public int increase(int v){
		++v;
		return v;
	}
	
	
	public static void main(String[] args) {
		
		int var1 = 100;
		MethodEx04 m = new MethodEx04();
		m.increase(var1);
		
		System.out.println("var1 : "+ var1);
		
		int var2 = m.increase(var1);
		System.out.println("var2 : "+ var2);
		
	}

}
