
public class MethodEx05 {

	public void increase(int[] n){
		for(int i=0; i<n.length; i++)
			n[i]++;
	}
	
	public static void main(String[] args) {
		
		int[] ref = {100, 200, 300};	//�迭�� �߰�ȣ�� �ʱ�ȭ�ϴ°��� �����Ҷ��� ����
		
		for(int i=0; i<ref.length; i++){
			System.out.println(ref[i]);
		}
		
		MethodEx05 m = new MethodEx05();
		m.increase(ref);
		System.out.println(ref);
		
		for(int i=0; i<ref.length; i++){
			System.out.println(ref[i]);
		}

	}

}
