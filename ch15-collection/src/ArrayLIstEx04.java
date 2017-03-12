import java.util.ArrayList;

public class ArrayLIstEx04 {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("배트맨");
		al.add("홍길동");
		al.add("일지매");
		al.add("짱구");
		al.add("강하늘");
		//al.add(new Integer(1000)); 타입제한으로 못 들어감
		
		for(int i=0; i<al.size(); i++){
			System.out.println(al.get(i));
		}

	}

}
