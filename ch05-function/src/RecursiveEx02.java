
public class RecursiveEx02 {

	public static void main(String[] args) {
		
		showJava(4);

	}
	
	public static void showJava(int cnt){
		System.out.println("JAVA");
		
		if(cnt==1)	//���������� ���ȣ�⹮ ���� �־���Ѵ�.
			return;
		
		showJava(--cnt);	//������, �İ��� ����! ex) cnt--
		
		
	}

}
