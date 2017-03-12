import java.util.ArrayList;

public class ArrayListEx07 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(15);
		al.add(5);
		al.add(17);
		
		for(int i:al){	//오토 언박싱으로 들어옴
			System.out.println(i);
		}
		
		System.out.println();
		for(int i=0; i<al.size(); i++){
			System.out.println(al.get(i));
		}
		
		System.out.println("순차적으로 데이터 삭제");
		/*for(int i=0; i<al.size(); i++){
			if(al.get(i)%2==0){
				al.remove(i);
			}
		}지울때마다 길이가 재설정됨*/
		
		for(int i=al.size()-1;i>=0;i--){	//역순으로 할 때 -1하는것에 유의
			if(al.get(i)%2 == 0){
				al.remove(i);
			}
		}
		
		for(int i=0; i<al.size(); i++){
			System.out.println(al.get(i));
		}

	}

}
