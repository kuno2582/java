import java.util.ArrayList;

public class ArrayListEx06 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(new Integer(10));
		al.add(new Integer(20));
		al.add(30);	//����ڽ��� �Ͼ�� ��ü�� ��
		al.add(40);
		
		for(Integer i:al){
			System.out.println(i);
		}

	}

}
