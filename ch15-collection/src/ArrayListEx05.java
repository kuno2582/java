import java.util.ArrayList;

public class ArrayListEx05 {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("��Ʈ��");
		al.add("����");
		al.add("������");
		al.add("������");
		al.add("������");
		
		for(String str: al){
			System.out.println(str);
		}
		
		al.remove(2);
		System.out.println("--------------");
		
		for(String str: al){
			System.out.println(str);
		}
		
		al.remove("������");
		System.out.println("--------------");
		for(String str: al){
			System.out.println(str);
		}
		
	}

}
