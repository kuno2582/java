/*

������ ����(scope, ���ÿ���)
 - ������ ���� �� �ִ� ����
 - ������ ����� ����({})�� ����� ������ �ڵ� �Ҹ�˴ϴ�.
 - ������ ������ �ٸ��� ������ �������� ���� �� �ֽ��ϴ�.
 - �޼ҵ��� �Ű������� �޼ҵ峻������ ��ȿ�� ���������̴�.

*/
public class VariableEx01 {

	public static void main(String[] args) {
		
		boolean scope = true;
		
		if(scope){
			int num = 10;
			num++;
			System.out.println(num);
		}else{
			
			int num = 20;
			System.out.println(num);
		}
		
		callNum();

	}
	
	public static void callNum(){
		int num = 30;
		
		System.out.println(num);
	}

}
