
public class ExceptionEx07 {

	public static void main(String[] args) {
		
		try {
			int num = Integer.parseInt(args[0]);
			
			System.out.println("���ڰ�: " + num);
		} catch (Exception e) {
			System.out.println("�Ű������� �߸� �ԷµǾ����ϴ�.");
		}finally {
			System.out.println("���α׷��� �����մϴ�.");
		}
		
		
	}

}
