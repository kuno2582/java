import java.util.ArrayList;

public class ArrayListEx05 {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("배트맨");
		al.add("성소");
		al.add("아이유");
		al.add("최유정");
		al.add("백진희");
		
		for(String str: al){
			System.out.println(str);
		}
		
		al.remove(2);
		System.out.println("--------------");
		
		for(String str: al){
			System.out.println(str);
		}
		
		al.remove("백진희");
		System.out.println("--------------");
		for(String str: al){
			System.out.println(str);
		}
		
	}

}
