import java.util.ArrayList;

public class ArrayLIstEx04 {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("��Ʈ��");
		al.add("ȫ�浿");
		al.add("������");
		al.add("¯��");
		al.add("���ϴ�");
		//al.add(new Integer(1000)); Ÿ���������� �� ��
		
		for(int i=0; i<al.size(); i++){
			System.out.println(al.get(i));
		}

	}

}
