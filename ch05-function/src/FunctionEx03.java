
/*

�Լ��� ��ȯ��
 - �ϳ��� ������� �����ٶ� return���� �Բ� ���
 - �Լ��� ������ ���� ���� �Լ� �̸� �տ� ���������� �����ǰ� �˴ϴ�.
 - ������ ���� ������ void������ �Լ��� �������־�� �մϴ�.
 
 
return 
 - ���� �������� �� �Լ��� �����Ű��, �Լ��� ȣ���� ������ �̵��ϴ� ����
 - �Լ��� ���� ������ �� return���� �Բ� ���(���� ��ȯ)
 - �Լ��� ��ȯ�� ���� ���ٸ� return; ���� ��������
 
static
 - ��������, Ŭ������ ��ü�� �������� �ʾƵ� ���ٰ����ϰ� ��.
*/
public class FunctionEx03 {

	public static void main(String[] args) {
		
		System.out.println(plus(3,7));
		System.out.println(square(8));
		byExit();
	
	}
	
	public static int plus(int num1, int num2){
		
		
		return num1+num2;
	}
	
	public static double square(double num){
		return num*num;
	}
	
	public static void byExit(){
		System.out.println("���α׷� ����!");
	}
	
	

}
