import java.util.ArrayList;

public class ArrayListEx06 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(new Integer(10));
		al.add(new Integer(20));
		al.add(30);	//오토박싱이 일어나서 객체로 들어감
		al.add(40);
		
		for(Integer i:al){
			System.out.println(i);
		}

	}

}
