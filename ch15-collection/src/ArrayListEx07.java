import java.util.ArrayList;

public class ArrayListEx07 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(15);
		al.add(5);
		al.add(17);
		
		for(int i:al){	//���� ��ڽ����� ����
			System.out.println(i);
		}
		
		System.out.println();
		for(int i=0; i<al.size(); i++){
			System.out.println(al.get(i));
		}
		
		System.out.println("���������� ������ ����");
		/*for(int i=0; i<al.size(); i++){
			if(al.get(i)%2==0){
				al.remove(i);
			}
		}���ﶧ���� ���̰� �缳����*/
		
		for(int i=al.size()-1;i>=0;i--){	//�������� �� �� -1�ϴ°Ϳ� ����
			if(al.get(i)%2 == 0){
				al.remove(i);
			}
		}
		
		for(int i=0; i<al.size(); i++){
			System.out.println(al.get(i));
		}

	}

}
