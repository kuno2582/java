/*
throw 
���ܸ� ���������� �߻�
�����ڰ� �ǵ������� ���ܸ� �߻���Ű���� �� �� ���
����ڿ��� �� ���ܰ� �߻��ߴ��� �˸��� ����


throw new ����Ŭ����(����);



*/
public class ExceptionEx06 {
	
	public void methodA(String[] a) throws Exception{
		
		if(a.length > 0){
			for(int i=0; i<a.length; i++){
				System.out.println("a[" + i + "]: " + a[i]);
			}
		}else{
			throw new Exception("�Է��� �����Ͱ� �����ϴ�.");
		}
		
	}

	public static void main(String[] args) {
		
		ExceptionEx06 ex = new ExceptionEx06();
		
		
		
		try{
		
			ex.methodA(args);
			
		}catch(Exception e){
			System.out.println(e.getLocalizedMessage());
		}

	}

}
