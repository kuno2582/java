
public class ExceptionEx03 {

	public static void main(String[] args) {
		
		int[] var = {10, 20, 30};

		try{
			//System.out.println("Important Message!");
			System.out.println("var[4]" + var[4]);
			System.out.println("Important Message!");	//���ܹ߻� ���� �ڵ�� ������� �ʴ´�
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ERROR-���� �ε����� ȣ���߽��ϴ�.");
		}
		
		System.out.println("���α׷� ����!");
	}

}
